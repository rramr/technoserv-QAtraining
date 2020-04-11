package test.technoserv.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ValidationFormDemoTest {
    public WebDriver driver; //Driver init
    public String baseUrl = "http://demo.guru99.com/V1/index.php"; //URL init
    public String userValidationMessageActual;
    public String passwordValidationMessageActual;

    @BeforeClass
    public void OpenSite() {
        driver = new ChromeDriver(); //ChromeDriver init
        driver.get(baseUrl); //Get to URL
    }

    @Test
    public void ValidationFormDemo() {
        //Init a lot of page elements ..
        WebElement usernameControl = driver.findElement(By.name("uid"));
        WebElement passwordControl = driver.findElement(By.name("password"));
        WebElement userValidationMessage = driver.findElement(By.id("message23"));
        WebElement passwordValidationMessage = driver.findElement(By.id("message18"));

        //Empty click form
        usernameControl.click();
        passwordControl.click();
        usernameControl.click();

        //Wait for visible elements
        userValidationMessageActual = userValidationMessage.getAttribute("style");
        passwordValidationMessageActual = passwordValidationMessage.getAttribute("style");

        //Asserts that elements is visible
        Assert.assertEquals(userValidationMessageActual, "visibility: visible;");
        Assert.assertEquals(passwordValidationMessageActual, "visibility: visible;");

        //Filling form
        usernameControl.sendKeys("a");
        passwordControl.sendKeys("a");

        //Wait for invisible elements
        userValidationMessageActual = userValidationMessage.getAttribute("style");
        passwordValidationMessageActual = passwordValidationMessage.getAttribute("style");

        //Asserts that elements is invisible
        Assert.assertEquals(userValidationMessageActual, "visibility: hidden;");
        Assert.assertEquals(passwordValidationMessageActual, "visibility: hidden;");
    }

    @AfterClass
    public void CloseSite() {
        driver.close(); //Stopping driver
    }
}