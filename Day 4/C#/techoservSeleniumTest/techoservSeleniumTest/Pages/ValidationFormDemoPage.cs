using OpenQA.Selenium;
using techoservSeleniumTest.Initialization;

namespace techoservSeleniumTest.Pages
{
    class ValidationFormDemoPage
    {
        //Поле ввода ID пользователя
        public static IWebElement UserIDInput => InitScenario.driver.FindElement(By.XPath(Init.JSON["ValidationFormDemo:XPath:userIDInput"]));

        //Поле ввода пароля
        public static IWebElement PasswordInput => InitScenario.driver.FindElement(By.XPath(Init.JSON["ValidationFormDemo:XPath:passwordInput"]));

        //Текстовое уведомление о пустом поле ID пользователя
        public static IWebElement UserIDValidationLabel => InitScenario.driver.FindElement(By.XPath(Init.JSON["ValidationFormDemo:XPath:userIDValidationLabel"]));

        //Текстовое уведомление о пустом поле пароля
        public static IWebElement PasswordValidationLabel => InitScenario.driver.FindElement(By.XPath(Init.JSON["ValidationFormDemo:XPath:passwordValidationLabel"]));
    }
}