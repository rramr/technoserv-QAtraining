using Microsoft.VisualStudio.TestTools.UnitTesting;
using OpenQA.Selenium;
using techoservSeleniumTest.Initialization;
using techoservSeleniumTest.Pages;
using TechTalk.SpecFlow;

namespace techoservSeleniumTest.Steps
{
    [Binding]
    public class ValidationFormDemoSteps
    {
        readonly IWebDriver driver = InitScenario.driver;
        private IWebElement usernameControl;
        private IWebElement passwordControl;
        private IWebElement userValidationMessage;
        private IWebElement passwordValidationMessage;

        [Given(@"Пользователь открывает страницу с формой и скрытыми сообщениями")]
        public void GivenПользовательОткрываетСтраницуСФормойИСкрытымиСообщениями()
        {
            driver.Url = Init.JSON["ValidationFormDemo:url"];

            usernameControl = ValidationFormDemoPage.UserIDInput;
            passwordControl = ValidationFormDemoPage.PasswordInput;
            userValidationMessage = ValidationFormDemoPage.UserIDValidationLabel;
            passwordValidationMessage = ValidationFormDemoPage.PasswordValidationLabel;
        }
        
        [Given(@"Переключается между полями и оставляет их пустыми")]
        public void GivenПереключаетсяМеждуПолямиИОставляетИхПустыми()
        {
            usernameControl.Click();
            passwordControl.Click();
            usernameControl.Click();
        }
        
        [Given(@"Получает предупреждающие сообщения")]
        public void GivenПолучаетПредупреждающиеСообщения()
        {
            Assert.IsTrue(userValidationMessage.Displayed);
            Assert.IsTrue(passwordValidationMessage.Displayed);
        }
        
        [Given(@"Заполняет поля и сообщения скрываются")]
        public void GivenЗаполняетПоляИСообщенияСкрываются()
        {
            usernameControl.SendKeys("a");
            passwordControl.SendKeys("a");

            Assert.IsFalse(userValidationMessage.Displayed);
            Assert.IsFalse(passwordValidationMessage.Displayed);
        }
    }
}