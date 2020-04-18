using OpenQA.Selenium;
using OpenQA.Selenium.Support.UI;
using techoservSeleniumTest.Initialization;
using TechTalk.SpecFlow;

namespace techoservSeleniumTest
{
    [Binding]
    public class InitScenario
    {
        public static IWebDriver driver;
        public static WebDriverWait wait;

        [BeforeScenario]
        public void InitTest()
        {
            driver = Init.DriverInit();
            wait = Init.WaitInit();
            driver.Manage().Window.Maximize();
        }   

        [AfterScenario]
        public void CloseTest()
        {
            driver.Quit();
        }
    }
}