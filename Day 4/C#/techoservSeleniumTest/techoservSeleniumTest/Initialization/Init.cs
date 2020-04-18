using System;
using System.IO;
using System.Reflection;
using Microsoft.Extensions.Configuration;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;
using OpenQA.Selenium.Firefox;
using OpenQA.Selenium.Support.UI;

namespace techoservSeleniumTest.Initialization
{
    public class Init
    {
        public static IWebDriver driver;
        public static WebDriverWait wait;

        public static IConfiguration JSON = new ConfigurationBuilder()
            .SetBasePath(Path.Combine(Path.Combine(Directory.GetParent(Directory.GetCurrentDirectory()).ToString(), "techoservSeleniumTest/Properties")))
            .AddJsonFile("config.json", optional: true, reloadOnChange: true)
            .Build();

        public static IWebDriver DriverInit()
        {
            switch (JSON["Settings:browser"])
            {
                case "chrome": driver = new ChromeDriver(Path.GetDirectoryName(Assembly.GetExecutingAssembly().Location)); break;
                case "firefox": driver = new FirefoxDriver(Path.GetDirectoryName(Assembly.GetExecutingAssembly().Location)); break;
                default: Assert.Fail(); break;
            }
            return driver;
        }

        public static WebDriverWait WaitInit()
        {
            wait = new WebDriverWait(driver, TimeSpan.FromSeconds(2));
            return wait;
        }
    }
}