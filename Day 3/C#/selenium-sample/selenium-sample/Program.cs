using System;
using OpenQA.Selenium;
using OpenQA.Selenium.Firefox;
using OpenQA.Selenium.Chrome;

namespace selenium_sample
{
    class Program
    {
        static void Main(string[] args)
        {
            //IWebDriver driver = new FirefoxDriver();
            IWebDriver driver = new ChromeDriver();

            string baseUrl = "http://demo.guru99.com/test/newtours/";
            string expectedTitle = "Welcome: Mercury Tours";
            string actualTitle = "";

            driver.Url = baseUrl;

            actualTitle = driver.Title;

            if (actualTitle.Contains(expectedTitle))
            {
                Console.WriteLine("Test Passed!");
            }
            else
            {
                Console.WriteLine("Test Failed");
            }
            driver.Quit();
        }
    }
}
