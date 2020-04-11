package main.technoserv.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class PopupDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver(); //Driver init
        WebDriverWait wait = new WebDriverWait(driver, 20); //Wait init

        driver.get("http://demo.guru99.com/popup.php"); //Get to URL
        driver.manage().window().maximize(); //Maximized browser window

        //Find element on the page by XPath and click
        driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();

        //Get window descriptors
        String mainWindow = driver.getWindowHandle();

        //To handle all new opened window
        Set<String> allWindows = driver.getWindowHandles();

        //Loop to iterate  all window
        for (String childWindow : allWindows)
        {
            //if mainWindow != childWindow (with ignore register/case)
            if(!mainWindow.equalsIgnoreCase(childWindow))
            {
                //Switching to Child window
                driver.switchTo().window(childWindow);
                wait.until(
                        ExpectedConditions
                                .visibilityOfElementLocated(By.name("emailid")));
                //Send value to box and click
                driver.findElement(By.name("emailid")).sendKeys("email@email.com");
                driver.findElement(By.name("btnLogin")).click();

                //Wait for visible table
                wait.until(
                        ExpectedConditions
                                .visibilityOfElementLocated(
                                        By.xpath("/html/body/table/tbody/tr[1]/td/h2")));

                //Get registration info by table
                WebElement userIdElement = driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td[2]"));
                WebElement passwordElement = driver.findElement(By.xpath("/html/body/table/tbody/tr[5]/td[2]"));

                //Print registration info to console
                System.out.println(userIdElement.getText());
                System.out.println(passwordElement.getText());

                //Closing the Child Window.
                driver.close();
            }
        }
        // Switching to Parent window i.e Main Window.
        driver.switchTo().window(mainWindow);

        driver.quit(); //Stopping driver
    }
}