using OpenQA.Selenium;
using techoservSeleniumTest.Initialization;

namespace techoservSeleniumTest.Pages
{
    class PopupDemoPage
    {
        //Ссылка "Click Here"
        public static IWebElement PopupLink => InitScenario.driver.FindElement(By.XPath(Init.JSON["PopupDemo:XPath:popupLink"]));

        //Поле ввода "Email ID"
        public static IWebElement EmailIDInput => InitScenario.driver.FindElement(By.XPath(Init.JSON["PopupDemo:XPath:emailIDInput"]));

        //Кнопка "Submit"
        public static IWebElement SubmitInput => InitScenario.driver.FindElement(By.XPath(Init.JSON["PopupDemo:XPath:submitInput"]));

        //Таблица "Access details to demo site"
        public static IWebElement RegInfoTable => InitScenario.driver.FindElement(By.XPath(Init.JSON["PopupDemo:XPath:regInfoTable"]));

        //Ячейка таблицы с "User ID"
        public static IWebElement UserIDCell => InitScenario.driver.FindElement(By.XPath(Init.JSON["PopupDemo:XPath:userIDCell"]));

        //Ячейка таблицы с "Password"
        public static IWebElement PasswordCell => InitScenario.driver.FindElement(By.XPath(Init.JSON["PopupDemo:XPath:passwordCell"]));
    }
}