﻿Feature: Загрузка файла со страницы
	Для того чтобы загрузить файл
	Как пользователь
	Я хочу открыть страницу в браузере
	Нажать на кнопку загрузки файла
	Убедиться, что файл был загружен на компьютер

@Позитивный
Scenario: Файл загружен на компьютер
	* Пользователь открывает страницу загрузки файла
	* Нажимает на кнопку загрузки файла
	* Дожидается окончания загрузки файла
	* Файл загружен