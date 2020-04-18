using Microsoft.VisualStudio.TestTools.UnitTesting;
using OpenQA.Selenium;
using OpenQA.Selenium.Support.UI;
using techoservSeleniumTest.Initialization;
using techoservSeleniumTest.Pages;
using TechTalk.SpecFlow;

namespace techoservSeleniumTest.Steps
{
    [Binding]
    public class PopupDemoSteps
    {
        readonly IWebDriver driver = InitScenario.driver;
        readonly WebDriverWait wait = InitScenario.wait;

        [Given(@"Пользователь открывает страницу со ссылкой")]
        public void GivenПользовательОткрываетСтраницу()
        {
            driver.Url = Init.JSON["PopupDemo:url"];
        }

        [Given(@"Переходит по ссылке и в новой вкладке открывается страница с формой регистрации")]
        public void GivenВновойвкладкеоткрываетсястраницасформойрегистрации()
        {
            PopupDemoPage.PopupLink.Click();
            driver.SwitchTo().Window(driver.WindowHandles[1]);
        }
        
        [Given(@"Пользователь вводит адрес электронной почты и нажимает Submit")]
        public void GivenПользовательВводитАдресЭлектроннойПочтыИНаживаетSubmit()
        {
            wait.Until(SeleniumExtras.WaitHelpers.ExpectedConditions.ElementIsVisible(By.XPath(Init.JSON["PopupDemo:XPath:emailIDInput"])));

            PopupDemoPage.EmailIDInput.SendKeys("email@email.com");
            PopupDemoPage.SubmitInput.Click();
        }
        
        [Given(@"Пользователь видит таблицу с регистрационной информацией")]
        public void GivenПользовательВидитТаблицуСРегистрационнойИнформацией()
        {
            wait.Until(SeleniumExtras.WaitHelpers.ExpectedConditions.ElementIsVisible(By.XPath(Init.JSON["PopupDemo:XPath:regInfoTable"])));
            
            Assert.IsTrue(PopupDemoPage.RegInfoTable.Displayed);

            Assert.IsNotNull(PopupDemoPage.UserIDCell.Text);
            Assert.IsNotNull(PopupDemoPage.PasswordCell.Text);
        }
    }
}