﻿Feature: Получение регистрационной информации на отдельной странице
	Для того чтобы получить регистрационную информацию
	Как пользователь
	Я хочу открыть страницу в браузере
	Нажать на ссылку для перехода к форме регистраации в новой вкладке
	Ввести адрес электронной почты и нажать кнопку Submit
	Получить таблицу с регистрационной информацией

@Позитивный
Scenario: Пользователь получил регистрационную информацию
	* Пользователь открывает страницу со ссылкой
	* Переходит по ссылке и в новой вкладке открывается страница с формой регистрации
	* Пользователь вводит адрес электронной почты и нажимает Submit
	* Пользователь видит таблицу с регистрационной информацией