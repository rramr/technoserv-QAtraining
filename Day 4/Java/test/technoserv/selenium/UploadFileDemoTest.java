package test.technoserv.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;

public class UploadFileDemoTest {
    public WebDriver driver; //Driver init
    public String baseUrl = "http://demo.guru99.com/test/upload/"; //URL init
    public WebDriverWait wait; //Wait init

    @BeforeClass
    public void OpenSite() {
        driver = new ChromeDriver(); //ChromeDriver init
        driver.get(baseUrl); //Get to URL
        wait = new WebDriverWait(driver, 20);
    }

    @Test
    public void UploadFileDemo() {
        //Init and find upload button by id
        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

        //Enter the file path onto the file-selection input field
        uploadElement.sendKeys("/Users/alexandr/Downloads/rep.zip");

        //Check the "I accept the terms of service" check box
        driver.findElement(By.id("terms")).click();

        //Get sucsess message selector
        WebElement resultElement = driver.findElement(By.cssSelector("#res"));
        WebElement resultText = driver.findElement(By.cssSelector("#res > center"));

        //Click the "UploadFile" button
        driver.findElement(By.name("send")).click();

        //Wait for upload
        wait.until(ExpectedConditions.attributeContains(resultElement, "style", "display: block"));

        //Display upload sucsess
        Assert.assertTrue(resultText.getText().contains(" successfully"));
    }

    @AfterClass
    public void CloseSite() {
        driver.close(); //Stopping driver
    }
}