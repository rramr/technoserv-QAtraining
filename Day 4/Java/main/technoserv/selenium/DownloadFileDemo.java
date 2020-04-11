package main.technoserv.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class DownloadFileDemo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver(); //Driver init
        String baseUrl = "http://demo.guru99.com/test/yahoo.html"; //URL init

        driver.get(baseUrl); //Get to URL

        //Find element on the page by id
        WebElement downloadButton = driver.findElement(By.id("messenger-download"));
        //Get download link
        String sourceLocation = downloadButton.getAttribute("href");

        //Init wget command for download
        String wgetCommand = "wget -P /Users/alexandr/Downloads --no-check-certificate " + sourceLocation;
        //Print wget command to console
        System.out.println(wgetCommand);
        //Trying to download
        try {
            //Init process to download
            Process exec = Runtime.getRuntime().exec(wgetCommand);
            //Init getting exit value status
            int exitVal = exec.waitFor();
            //Init work with file
            File f = new File("/Users/alexandr/Downloads/msgr11us.exe");
            //Print status to console
            System.out.println("Exit value: " + exitVal);
            //Delete file
            f.delete();
        } catch (InterruptedException | IOException ex) {
            System.out.println(ex.toString()); //Print exception to console
        } finally {
            driver.quit(); //Stopping driver
        }
    }
}