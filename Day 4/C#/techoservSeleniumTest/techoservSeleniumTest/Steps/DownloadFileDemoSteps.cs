using Microsoft.VisualStudio.TestTools.UnitTesting;
using OpenQA.Selenium;
using System.IO;
using System.Net;
using techoservSeleniumTest.Initialization;
using techoservSeleniumTest.Pages;
using TechTalk.SpecFlow;

namespace techoservSeleniumTest.Steps
{
    [Binding]
    public class DownloadFileDemoSteps
    {
        readonly IWebDriver driver = InitScenario.driver;
        readonly string path = Init.JSON["DownloadFileDemo:pathToFile"];
        private string sourceLocation;
        
        [Given(@"Пользователь открывает страницу загрузки файла")]
        public void GivenПользовательОткрываетСтраницуЗагрузкиФайла()
        {
            driver.Url = Init.JSON["DownloadFileDemo:url"];
        }
        
        [Given(@"Нажимает на кнопку загрузки файла")]
        public void GivenНажимаетНаКнопкуЗагрузкиФайла()
        {
            sourceLocation = DownloadFileDemoPage.DownloadButton.GetAttribute("href");
        }
        
        [Given(@"Дожидается окончания загрузки файла")]
        public void GivenДожидаетсяОкончанияЗагрузкиФайла()
        {
            var download = new WebClient();
            download.DownloadFile(sourceLocation, path);
        }
        
        [Given(@"Файл загружен")]
        public void GivenФайлЗагружен()
        {
            FileInfo file = new FileInfo(path);
            Assert.IsTrue(file.Exists);
            file.Delete();
        }
    }
}