package test.technoserv.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Set;

public class PopupDemoTest {
    public WebDriver driver; //Driver init
    public String baseUrl = "http://demo.guru99.com/popup.php"; //URL init
    public WebDriverWait wait; //Wait init
    public Boolean emptyField;
    @BeforeClass
    public void OpenSite() {
        driver = new ChromeDriver(); //ChromeDriver init
        driver.get(baseUrl); //Get to URL
        wait = new WebDriverWait(driver, 20);
    }

    @Test
    public void PopupDemo() {
        //Maximized browser window
        driver.manage().window().maximize();

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

                //Assert table visibility
                String tableVisible = driver.findElement(By.xpath("/html/body/table")).getCssValue("visibility");
                Assert.assertEquals(tableVisible,"visible");

                //Get registration info by table
                WebElement userIdElement = driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td[2]"));
                WebElement passwordElement = driver.findElement(By.xpath("/html/body/table/tbody/tr[5]/td[2]"));

                //Assert that userId cell is not empty
                emptyField = userIdElement.getText().isEmpty();
                Assert.assertFalse(emptyField);

                //Assert that password cell is not empty
                emptyField = passwordElement.getText().isEmpty();
                Assert.assertFalse(emptyField);
            }
        }
        // Switching to Parent window i.e Main Window.
        driver.switchTo().window(mainWindow);
    }

    @AfterClass
    public void CloseSite() {
        driver.quit(); //Stopping driver
    }
}