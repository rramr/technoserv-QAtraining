package main.technoserv.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithClickAndSubmitDemo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver(); //Driver init
        String baseUrl = "http://demo.guru99.com/test/login.html"; //URL init
        String success;

        driver.get(baseUrl); //Get to URL

        // Init email WebElement by id
        WebElement email = driver.findElement(By.id("email"));
        //Init email WebElement by id
        WebElement password = driver.findElement(By.name("passwd"));

        //Send value to box
        email.sendKeys("abcd@gmail.com");
        password.sendKeys("abcdefgh");
        System.out.println("Text Field Set");

        //Deleting values in the text box
        email.clear();
        password.clear();
        System.out.println("Text Field Cleared");

        //Find the submit button
        WebElement login = driver.findElement(By.id("SubmitLogin"));

        //Using click method to submit form
        email.sendKeys("abcd@gmail.com");
        password.sendKeys("abcdefgh");
        login.click();
        //Print click result
        System.out.println("Login Done with Click");
        success = driver.findElement(By.xpath("/html/body/div[2]/div/div/h3")).getText();
        System.out.println(success);

        driver.get(baseUrl); //Get to URL

        //Using submit method to submit the form. Submit used on password field
        driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
        driver.findElement(By.name("passwd")).sendKeys("abcdefgh");
        driver.findElement(By.id("SubmitLogin")).submit();
        //Print submit result
        System.out.println("Login Done with Submit");
        success = driver.findElement(By.xpath("/html/body/div[2]/div/div/h3")).getText();
        System.out.println(success);

        driver.quit();//Stopping driver
    }
}