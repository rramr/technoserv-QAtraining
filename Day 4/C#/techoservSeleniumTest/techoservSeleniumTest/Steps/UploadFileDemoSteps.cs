using Microsoft.VisualStudio.TestTools.UnitTesting;
using OpenQA.Selenium;
using OpenQA.Selenium.Support.UI;
using techoservSeleniumTest.Initialization;
using techoservSeleniumTest.Pages;
using TechTalk.SpecFlow;

namespace techoservSeleniumTest.Steps
{
    [Binding]
    public class UploadFileDemoSteps
    {
        readonly IWebDriver driver = InitScenario.driver;
        readonly WebDriverWait wait = InitScenario.wait;

        [Given(@"Пользователь открывает страницу с формой отправки файла")]
        public void GivenПользовательОткрываетСтраницуСФормойОтправкиФайла()
        {
            driver.Url = Init.JSON["UploadFileDemo:url"];
        }
        
        [Given(@"Прикрепляет файл к форме")]
        public void GivenПрикрепляетФайлКФорме()
        {
            UploadFileDemoPage.UploadFileInput.SendKeys(Init.JSON["UploadFileDemo:pathToUploadFile"]);
        }
        
        [Given(@"Соглашается с правилами")]
        public void GivenСоглашаетсяСПравилами()
        {
            UploadFileDemoPage.CheckBox.Click();
            Assert.IsTrue(UploadFileDemoPage.CheckBox.Selected);
        }
        
        [Given(@"Нажимает кнопку отправки и получает сообщение об успехе")]
        public void GivenНажимаетКнопкуОтправкиИПолучаетСообщениеОбУспехе()
        {
            UploadFileDemoPage.UploadButton.Click();
            wait.Until(SeleniumExtras.WaitHelpers.ExpectedConditions.ElementIsVisible(By.XPath(Init.JSON["UploadFileDemo:XPath:successMessage"])));
            Assert.IsTrue(UploadFileDemoPage.SuccessMessage.Displayed);
            Assert.IsTrue(UploadFileDemoPage.SuccessMessage.Text.Contains(" successfully"));
        }
    }
}