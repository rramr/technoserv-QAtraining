using OpenQA.Selenium;
using techoservSeleniumTest.Initialization;

namespace techoservSeleniumTest.Pages
{
    class UploadFileDemoPage
    {
        //Поле выгрузки файла
        public static IWebElement UploadFileInput => InitScenario.driver.FindElement(By.XPath(Init.JSON["UploadFileDemo:XPath:uploadFileInput"]));

        //Чекбокс о согласии с правилами
        public static IWebElement CheckBox => InitScenario.driver.FindElement(By.XPath(Init.JSON["UploadFileDemo:XPath:checkBox"]));

        //Кнопка отправки
        public static IWebElement UploadButton => InitScenario.driver.FindElement(By.XPath(Init.JSON["UploadFileDemo:XPath:uploadButton"]));

        //Сообщение об успешной выгрузке
        public static IWebElement SuccessMessage => InitScenario.driver.FindElement(By.XPath(Init.JSON["UploadFileDemo:XPath:successMessage"]));
    }
}