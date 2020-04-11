# Реализация на Java

### Для запуска могут понадобиться:
- [Selenium](https://www.selenium.dev/downloads/ "Selenium download")
- [TestNG](https://oss.sonatype.org/content/repositories/snapshots/org/testng/testng/ "TestNG download")
- [GNU Wget](http://ftp.gnu.org/gnu/wget "GNU Wget download")

### Структура
#### Директория "main/technoserv/selenium":

- AlertDemo - [AlertDemo.java](main/technoserv/selenium/AlertDemo.java "AlertDemo.java")
- DownloadFileDemo - [DownloadFileDemo.java](main/technoserv/selenium/DownloadFileDemo.java "DownloadFileDemo.java")
- LoginWithClickAndSubmitDemo - [LoginWithClickAndSubmitDemo.java](main/technoserv/selenium/LoginWithClickAndSubmitDemo.java "LoginWithClickAndSubmitDemo.java")
- PopupDemo - [PopupDemo.java](main/technoserv/selenium/PopupDemo.java "PopupDemo.java")
- TitleDemo - [TitleDemo.java](main/technoserv/selenium/TitleDemo.java "TitleDemo.java")
- UploadFileDemo - [UploadFileDemo.java](main/technoserv/selenium/UploadFileDemo.java "UploadFileDemo.java")
- ValidationFormDemo - [ValidationFormDemo.java](main/technoserv/selenium/ValidationFormDemo.java "ValidationFormDemo.java")

#### Директория "test/technoserv/selenium":

- AlertDemoTest - [AlertDemoTest.java](test/technoserv/selenium/AlertDemoTest.java "AlertDemoTest.java")
- DownloadFileDemoTest - [DownloadFileDemoTest.java](test/technoserv/selenium/DownloadFileDemoTest.java "DownloadFileDemoTest.java")
- LoginWithClickAndSubmitDemoTest - [LoginWithClickAndSubmitDemoTest.java](test/technoserv/selenium/LoginWithClickAndSubmitDemoTest.java "LoginWithClickAndSubmitDemoTest.java")
- PopupDemoTest - [PopupDemoTest.java](test/technoserv/selenium/PopupDemoTest.java "PopupDemoTest.java")
- TitleDemoTest - [TitleDemoTest.java](test/technoserv/selenium/TitleDemoTest.java "TitleDemoTest.java")
- UploadFileDemoTest - [UploadFileDemoTest.java](test/technoserv/selenium/UploadFileDemoTest.java "UploadFileDemoTest.java")
- ValidationFormDemoTest - [ValidationFormDemoTest.java](test/technoserv/selenium/ValidationFormDemoTest.java "ValidationFormDemoTest.java")

### Тестовые данные

| ID | Test | Input | Expected output |
|:----------:|:----------|:----------|:----------|
| 1 | [AlertDemoTest.java](test/technoserv/selenium/AlertDemoTest.java "AlertDemoTest.java") | `cusid = 53920` | Firts alert text: `"Do you really want to delete this Customer?"` <br/> Second alert text: `"Customer Successfully Delete!"`    |
| 2 | [DownloadFileDemoTest.java](test/technoserv/selenium/DownloadFileDemoTest.java "DownloadFileDemoTest.java") | wgetCommand | *File exists in directory* |
| 3 | [LoginWithClickAndSubmitDemoTest.java](test/technoserv/selenium/LoginWithClickAndSubmitDemoTest.java "LoginWithClickAndSubmitDemoTest.java") | email = `abcd@gmail.com` <br/> password = `abcdefgh` | If both methods (click and submit) is work: `"Successfully Logged in..."` |
| 4 | [PopupDemoTest.java](test/technoserv/selenium/PopupDemoTest.java "PopupDemoTest.java") | emailid = `email@email.com` | *Show registration info and cells is not empty* |
| 5 | [TitleDemoTest.java](test/technoserv/selenium/TitleDemoTest.java "TitleDemoTest.java") | *Open tab and check title* | *Title is not empty* |
| 6 | [UploadFileDemoTest.java](test/technoserv/selenium/UploadFileDemoTest.java "UploadFileDemoTest.java") | *Uploaded file* | Message, after upload file, that contains <br/> `" successfully"` |
| 7 | [ValidationFormDemoTest.java](test/technoserv/selenium/ValidationFormDemoTest.java "ValidationFormDemoTest.java") | *Making an empty click on the form* | *if switch both empty input, show validation message. Else, validation message is hidden* |