package main.technoserv.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver(); //Driver init

        driver.get("http://demo.guru99.com/test/newtours/"); //Get to URL

        System.out.println("Chrome title = " + driver.getTitle()); //Get and print tab title to console

        driver.quit(); //Stopping driver
    }
}