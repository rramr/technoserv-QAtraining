# Реализация на Java

### Для запуска могут понадобиться:
- [Selenium](https://www.selenium.dev/downloads/ "Selenium download")
- [ChromeDriver](https://chromedriver.chromium.org/downloads "ChromeDriver download")
- [geckodriver](https://github.com/mozilla/geckodriver/releases "geckodriver download")
- [Homebrew](https://brew.sh/index_ru "Homebrew download")

### Структура

- Sample - [Sample.java](main/technoserv/selenium/Sample.java "Sample.java")

### Настройка драйверов

#### Google Chrome

1. Ручная установка ChromeDriver в директорию `/usr/local/bin/chromedriver` и вызов его командой или установка через Homebrew командой `brew install chromedriver`
2. Перед инициализацие драйвера указать системное свойство, содержащее путь к драйверу `System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");`

#### Firefox

1. Ручная установка geckodriver в директорию `/usr/local/bin/geckodriver` и вызов его командой или установка через Homebrew командой `brew install geckodriver`
2. Перед инициализацие драйвера указать системное свойство, содержащее путь к драйверу `System.setProperty("webdriver.gecko.driver","/usr/local/bin/geckodriver");`

#### Safari

1. Включить инструменты разработчика: Safari -> Настройки -> Дополнения -> Показывать меню “Разработка” в строке меню
2. В инструментах разработчика: Разрабтка -> Разрешить удаленную автоматизацию

### Настройка IntelliJ IDEA: IDE

1. File -> Project Structure... -> Project Settings -> Project -> Projectlanguage level -> SDK default
2. File -> Project Structure... -> Project Settings -> Modules -> Language level -> Project default
3. IntelliJ IDEA -> Preferences... -> Build, Execution, Deployment -> Compiler -> Java Compiler -> Project bytecode version -> ***latest*** 