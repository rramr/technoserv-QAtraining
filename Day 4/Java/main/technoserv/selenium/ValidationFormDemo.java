package main.technoserv.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ValidationFormDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver(); //Driver init
        WebDriverWait wait = new WebDriverWait(driver, 20); //Wait init
        String baseUrl = "http://demo.guru99.com/V1/index.php"; //URL init

        driver.get(baseUrl); //Get to URL

        //Init a lot of page elements ..
        WebElement usernameControl = driver.findElement(By.name("uid"));
        WebElement passwordControl = driver.findElement(By.name("password"));
        WebElement userValidationMessage = driver.findElement(By.id("message23"));
        WebElement passwordValidationMessage = driver.findElement(By.id("message18"));

        System.out.println(userValidationMessage.getAttribute("style"));
        System.out.println(passwordValidationMessage.getAttribute("style"));

        //Empty click form
        usernameControl.click();
        passwordControl.click();
        usernameControl.click();

        System.out.println(userValidationMessage.getAttribute("style"));
        System.out.println(passwordValidationMessage.getAttribute("style"));

        //Filling form
        usernameControl.sendKeys("a");
        passwordControl.sendKeys("a");

        System.out.println(userValidationMessage.getAttribute("style"));
        System.out.println(passwordValidationMessage.getAttribute("style"));

        driver.quit(); //Stopping driver
    }
}