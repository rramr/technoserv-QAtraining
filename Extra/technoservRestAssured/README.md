# API тестирование (Java + TestNG + restAssured)

### Задание

> Используя сервис с тестовым REST-API https://reqres.in/, написать 2 теста.
Первый – получить список пользователей (GET  https://reqres.in/api/users?page=2), замапить на объект и проверить, что все поля пришли (достаточно на notNull).
Второй – создать пользователя (POST https://reqres.in/api/users) с данными из примера на сайте: подготовить тело запроса, отправить запрос с телом, замапить ответ на объект и проверить, что в ответе те же самые значения из запроса.

### Структура

- [GET.java](src/test/java/GET.java "GET.java")
- [POST.java](src/test/java/POST.java "POST.java")

### Maven зависимости

#### *restAssured*
```
<dependency>
	<groupId>io.rest-assured</groupId>
	<artifactId>rest-assured</artifactId>
	<version>3.1.0</version>
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

#### *JSON In Java*
```
<dependency>
	<groupId>org.json</groupId>
	<artifactId>json</artifactId>
	<version>20190722</version>
</dependency>
```