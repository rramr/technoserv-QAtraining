package test.technoserv.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginWithClickAndSubmitDemoTest {
    public WebDriver driver; //Driver init
    public String baseUrl = "http://demo.guru99.com/test/login.html"; //URL init
    String expectedTitle = "Successfully Logged in...";
    String actualTitle;

    @BeforeClass
    public void OpenSite() {
        driver = new ChromeDriver(); //ChromeDriver init
        driver.get(baseUrl); //Get to URL
    }

    @Test
    public void LoginWithClickAndSubmitDemo() {
        // Init email WebElement by id
        WebElement email = driver.findElement(By.id("email"));
        //Init email WebElement by id
        WebElement password = driver.findElement(By.name("passwd"));

        //Send value to box
        email.sendKeys("abcd@gmail.com");
        password.sendKeys("abcdefgh");

        //Deleting values in the text box
        email.clear();
        password.clear();

        //Find the submit button
        WebElement login = driver.findElement(By.id("SubmitLogin"));

        //Using click method to submit form
        email.sendKeys("abcd@gmail.com");
        password.sendKeys("abcdefgh");
        login.click();
        //Assert click result
        actualTitle = driver.findElement(By.xpath("/html/body/div[2]/div/div/h3")).getText();
        Assert.assertEquals(actualTitle, expectedTitle);

        //Using submit method to submit the form. Submit used on password field
        driver.get(baseUrl);
        driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
        driver.findElement(By.name("passwd")).sendKeys("abcdefgh");
        driver.findElement(By.id("SubmitLogin")).submit();
        //Assert submit result
        actualTitle = driver.findElement(By.xpath("/html/body/div[2]/div/div/h3")).getText();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @AfterClass
    public void CloseSite() {
        driver.close(); //Stopping driver
    }
}