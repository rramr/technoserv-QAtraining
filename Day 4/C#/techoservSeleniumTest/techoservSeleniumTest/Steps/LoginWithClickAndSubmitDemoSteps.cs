using Microsoft.VisualStudio.TestTools.UnitTesting;
using OpenQA.Selenium;
using techoservSeleniumTest.Initialization;
using techoservSeleniumTest.Pages;
using TechTalk.SpecFlow;

namespace techoservSeleniumTest.Steps
{
    [Binding]
    public class LoginWithClickAndSubmitDemoSteps
    {
        readonly IWebDriver driver = InitScenario.driver;
        private IWebElement emailInput;
        private IWebElement passwordInput;
        private IWebElement submitButton;
        readonly string email = Init.JSON["LoginWithClickAndSubmitDemo:regInfo:email"];
        readonly string password = Init.JSON["LoginWithClickAndSubmitDemo:regInfo:password"];

        [Given(@"Пользователь открывает страницу с формой регистраци")]
        public void GivenПользовательОткрываетСтраницуСФормойРегистраци()
        {
            driver.Url = Init.JSON["LoginWithClickAndSubmitDemo:url"];

            emailInput = LoginWithClickAndSubmitDemoPage.EmailInput;
            passwordInput = LoginWithClickAndSubmitDemoPage.PasswordInput;
            submitButton = LoginWithClickAndSubmitDemoPage.SignInButton;
        }
        
        [Given(@"Заполняет форму и нажимает кнопку отправки данных методом Click")]
        public void GivenЗаполняетФормуИНажимаетКнопкуОтправкиДанныхМетодомClick()
        {
            FormFilling();
            submitButton.Click();
        }

        [Given(@"Заполняет форму и нажимает кнопку отправки данных методом Submit")]
        public void GivenЗаполняетФормуИНажимаетКнопкуОтправкиДанныхМетодомSubmit()
        {
            FormFilling();
            submitButton.Submit();
        }

        [Given(@"Видит сообщение об успешной регистрации")]
        public void GivenВидитСообщениеОбУспешнойРегистрации()
        {
            string expected = Init.JSON["LoginWithClickAndSubmitDemo:expectedTitle"];
            string actual = LoginWithClickAndSubmitDemoPage.ActualTitle.Text;
            Assert.AreEqual(expected, actual);
        }

        public void FormFilling()
        {
            emailInput.SendKeys(email);
            passwordInput.SendKeys(password);
        }
    }
}