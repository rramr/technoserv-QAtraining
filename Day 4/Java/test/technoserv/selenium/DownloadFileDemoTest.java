package test.technoserv.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class DownloadFileDemoTest {
    public WebDriver driver; //Driver init
    public String baseUrl = "http://demo.guru99.com/test/yahoo.html"; //URL init
    public String wgetCommand; //Init wget command

    @BeforeClass
    public void OpenSite() {
        driver = new ChromeDriver(); //ChromeDriver init
        wgetCommand = "wget -P /Users/alexandr/Downloads --no-check-certificate "; //Set wget command for download
        driver.get(baseUrl); //Get to URL
    }

    @Test
    public void DownloadFileDemo() {
        //Find element on the page by id
        WebElement downloadButton = driver.findElement(By.id("messenger-download"));
        //Get download link
        String sourceLocation = downloadButton.getAttribute("href");

        //Change wget command for download
        wgetCommand += sourceLocation;

        //Trying to download
        try {
            //Init process to download
            Process exec = Runtime.getRuntime().exec(wgetCommand);
            //Init getting exit value status
            int exitVal = exec.waitFor();
            //Init work with file
            File f = new File("/Users/alexandr/Downloads/msgr11us.exe");
            //Print status to console
            Assert.assertTrue(f.exists());
            //Delete file
            f.delete();
        } catch (InterruptedException | IOException ex) {
            //If wget command does not complete
            throw new AssertionError(ex.toString());
        }
    }

    @AfterClass
    public void CloseSite() {
        driver.close(); //Stopping driver
    }
}