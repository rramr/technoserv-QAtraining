﻿Feature: Страница регистрации
	Для того чтобы пройти регистрацию
	Как пользователь
	Я хочу открыть страницу с формой регистраци в браузере
	Ввести адрес электронной почты и пароль и нажать кнопку регистрации
	Получить сообщение об успешной регистрации

@Позитивный через Click
Scenario: Успешная регистрация через Click
	* Пользователь открывает страницу с формой регистраци
	* Заполняет форму и нажимает кнопку отправки данных методом Click
	* Видит сообщение об успешной регистрации

@Позитивный через Submit
Scenario: Успешная регистрация через Submit
	* Пользователь открывает страницу с формой регистраци
	* Заполняет форму и нажимает кнопку отправки данных методом Submit
	* Видит сообщение об успешной регистрации