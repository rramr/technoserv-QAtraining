package main.technoserv.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadFileDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver(); //Driver init
        WebDriverWait wait = new WebDriverWait(driver, 20); //Wait init
        String baseUrl = "http://demo.guru99.com/test/upload/"; //URL init

        driver.get(baseUrl); //Get to URL

        //Init and find upload button by id
        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

        //Enter the file path onto the file-selection input field
        uploadElement.sendKeys("/Users/alexandr/Downloads/rep.zip");

        //Check the "I accept the terms of service" check box
        driver.findElement(By.id("terms")).click();

        //Get sucsess message selector
        WebElement resultElement = driver.findElement(By.cssSelector("#res"));
        WebElement resultText = driver.findElement(By.cssSelector("#res > center"));
        System.out.println(resultText.getText().contains(" successfully"));

        //Click the "UploadFile" button
        driver.findElement(By.name("send")).click();
        System.out.println(resultText.getText().contains(" successfully"));

        //Wait for upload
        wait.until(ExpectedConditions.attributeContains(resultElement, "style", "display: block"));

        //Display upload sucsess
        System.out.println(resultText.getText().contains(" successfully"));

        driver.quit(); //Stopping driver
    }
}