using OpenQA.Selenium;
using techoservSeleniumTest.Initialization;

namespace techoservSeleniumTest.Pages
{
    class AlertDemoPage
    {
        //Поле ввода
        public static IWebElement Input => InitScenario.driver.FindElement(By.XPath(Init.JSON["AlertDemo:XPath:input"]));

        //Кнопка "Submit"
        public static IWebElement Submit => InitScenario.driver.FindElement(By.XPath(Init.JSON["AlertDemo:XPath:submit"]));
    }
}