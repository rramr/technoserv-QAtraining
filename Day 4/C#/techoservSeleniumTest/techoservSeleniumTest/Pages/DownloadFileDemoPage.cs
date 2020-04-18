using OpenQA.Selenium;
using techoservSeleniumTest.Initialization;

namespace techoservSeleniumTest.Pages
{
    class DownloadFileDemoPage
    {
        //Кнопка загрузки
        public static IWebElement DownloadButton => InitScenario.driver.FindElement(By.XPath(Init.JSON["DownloadFileDemo:XPath:downloadButton"]));
    }
}