package test.technoserv.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AlertDemoTest {
    public WebDriver driver; //Driver init
    public String baseUrl = "http://demo.guru99.com/test/delete_customer.php"; //URL init
    public WebDriverWait wait; //Wait init

    @BeforeClass
    public void OpenSite() {
        driver = new ChromeDriver(); //ChromeDriver init
        driver.get(baseUrl); //Get to URL
        wait = new WebDriverWait(driver, 20);
    }

    @Test
    public void AlertDemo() {
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
        //Assert message
        Assert.assertEquals("Do you really want to delete this Customer?", alertMessage);
        //Press accept in alert window
        alert.accept();

        //Second alert window
        //Waiting for the alert window to appear
        wait.until(ExpectedConditions.alertIsPresent());
        //Switching to Alert
        Alert alert2 = driver.switchTo().alert();
        //Get message out alert window
        String alertMessage2 = alert2.getText();
        //Assert message
        Assert.assertEquals("Customer Successfully Delete!", alertMessage2);
        //Press accept in alert window
        alert.accept();
    }

    @AfterClass
    public void СloseSite() {
        driver.close(); //Stopping driver
    }
}