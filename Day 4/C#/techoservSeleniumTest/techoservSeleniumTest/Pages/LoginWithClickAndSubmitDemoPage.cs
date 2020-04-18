using OpenQA.Selenium;
using techoservSeleniumTest.Initialization;

namespace techoservSeleniumTest.Pages
{
    class LoginWithClickAndSubmitDemoPage
    {
        //Поле ввода адреса электронной почты
        public static IWebElement EmailInput => InitScenario.driver.FindElement(By.XPath(Init.JSON["LoginWithClickAndSubmitDemo:XPath:emailInput"]));

        //Поле ввода пароля
        public static IWebElement PasswordInput => InitScenario.driver.FindElement(By.XPath(Init.JSON["LoginWithClickAndSubmitDemo:XPath:passwordInput"]));

        //Кнопка отправки данных
        public static IWebElement SignInButton => InitScenario.driver.FindElement(By.XPath(Init.JSON["LoginWithClickAndSubmitDemo:XPath:signInButton"]));

        //Сообщение об успешной регистрации
        public static IWebElement ActualTitle => InitScenario.driver.FindElement(By.XPath(Init.JSON["LoginWithClickAndSubmitDemo:XPath:actualTitle"]));
    }
}