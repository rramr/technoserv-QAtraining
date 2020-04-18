using Microsoft.VisualStudio.TestTools.UnitTesting;
using OpenQA.Selenium;
using OpenQA.Selenium.Support.UI;
using techoservSeleniumTest.Initialization;
using techoservSeleniumTest.Pages;
using TechTalk.SpecFlow;

namespace techoservSeleniumTest
{
    [Binding]
    public class AlertDemoSteps
    {
        readonly IWebDriver driver = InitScenario.driver;
        readonly WebDriverWait wait = InitScenario.wait;
        private IAlert alert;

        [Given(@"Пользователь открывает страницу с формой удаления клиента")]
        public void GivenПользовательОткрываетСтраницуСФормойУдаленияКлиента()
        {
            driver.Url = Init.JSON["AlertDemo:url"];
        }
        
        [Given(@"Вводит ID клиента \((.*)\) и нажимает кнопку Submit")]
        public void GivenВводитIDКлиентаИНажимаетКнопкуSubmit(int id)
        {
            AlertDemoPage.Input.SendKeys(id.ToString());
            AlertDemoPage.Submit.Click();
        }
        
        [Given(@"Пользователь получает Alert окно в котором нужно подтвердить удаление")]
        public void GivenПользовательПолучаетAlertОкноВКоторомНужноПодтвердитьУдаление()
        {
            wait.Until(SeleniumExtras.WaitHelpers.ExpectedConditions.AlertIsPresent());

            alert = driver.SwitchTo().Alert();

            Assert.AreEqual(Init.JSON["AlertDemo:confirmAssertExpectedTitle"], alert.Text);
        }
        
        [Given(@"Пользователь подтверждает удаление")]
        public void GivenПользовательПодтверждаетУдаление()
        {
            alert.Accept();
        }
        
        [Given(@"Пользователь получает Alert окно об успешном удалении")]
        public void GivenПользовательПолучаетAlertОкноОбУспешномУдалении()
        {
            wait.Until(SeleniumExtras.WaitHelpers.ExpectedConditions.AlertIsPresent());

            alert = driver.SwitchTo().Alert();

            Assert.AreEqual(Init.JSON["AlertDemo:successAssertExpectedTitle"], alert.Text);
        }
    }
}