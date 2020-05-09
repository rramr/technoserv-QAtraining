# UI тестирование (Java + TestNG + Selenide)

### Задание

> - запустить Chrome 
> - открыть https://www.google.com/ 
> - написать в строке поиска «Открытие»
> - нажать Поиск
> - проверить, что результатах поиска есть https://www.open.ru 
> - перейти на сайт https://www.open.ru 
> - проверить в блоке «Курс обмена в интернет-банке», что курс продажи больше курса покупки, для USD и для EUR.

### Структура

- [USDEUR.java](src/test/java/OpenBank/USDEUR.java "USDEUR.java")

### Maven зависимости

#### * Selenide*
```
<dependency>
	<groupId>com.codeborne</groupId>
	<artifactId>selenide</artifactId>
	<version>5.11.1</version>
	<scope>test</scope>
</dependency>
```

#### *TestNG*
```
<dependency>
	<groupId>org.testng</groupId>
	<artifactId>testng</artifactId>
	<version>7.1.0</version>
	<scope>test</scope>
</dependency>
```