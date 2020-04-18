using TechTalk.SpecFlow;
using OpenQA.Selenium;
using techoservSeleniumTest.Initialization;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace techoservSeleniumTest
{
    [Binding]
    public class ПроверкаЗаголовкаСайтаSteps
    {
        readonly IWebDriver driver = InitScenario.driver;

        [Given(@"Пользователь вводит адрес сайта и нажимает кнопку Ввод")]
        public void GivenПользовательВводитАдресСайтаИНажимаетКнопкуВвод()
        {
            driver.Url = Init.JSON["TitleDemo:url"];
        }

        [Given(@"Открывается страница и сравнивается заголовок")]
        public void GivenОткрываетсяСтраницаИСравниваетсяЗаголовок()
        {
            string expected = Init.JSON["TitleDemo:expectedTitle"];
            string actual = driver.Title;
            Assert.AreEqual(expected, actual);
        }
    }
}