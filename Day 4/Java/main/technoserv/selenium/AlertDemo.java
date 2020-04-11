package main.technoserv.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver(); //Driver init
        WebDriverWait wait = new WebDriverWait(driver, 20); //Wait init
        String baseUrl = "http://demo.guru99.com/test/delete_customer.php"; //URL init

        driver.get(baseUrl); //Get to URL

        //Find element on the page by name and filling that
        driver.findElement(By.name("cusid")).sendKeys("53920");
        //Find element on the page by name and click
        driver.findElement(By.name("submit")).click();

        //First alert window
        //Waiting for the alert window to appear
        wait.until(ExpectedConditions.alertIsPresent());
        //Switching to Alert
        Alert alert = driver.switchTo().alert();
        //Get message out alert window
        String alertMessage = alert.getText();
        //Print message to console
        System.out.println(alertMessage);
        //Press accept in alert window
        alert.accept();

        //Second alert window
        //Waiting for the alert window to appear
        wait.until(ExpectedConditions.alertIsPresent());
        //Switching to Alert
        Alert alert2 = driver.switchTo().alert();
        //Get message out alert window
        String alertMessage2 = alert2.getText();
        //Print message to console
        System.out.println(alertMessage2);
        //Press accept in alert window
        alert.accept();

        driver.quit(); //Stopping driver
    }
}