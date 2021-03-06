﻿ Feature: Проверка незаполненных полей
	Для того чтобы убедиться, что все необходимые поля заполнены
	Как пользователь
	Я хочу открыть страницу с формой
	При заполнении формы увидеть сообщение о том, что поле не может быть пустым
	Убрать сообщение, заполнив поле 

@Позитивный
Scenario: Пользователь видит сообщения о незаполненных полях
	* Пользователь открывает страницу с формой и скрытыми сообщениями
	* Переключается между полями и оставляет их пустыми
	* Получает предупреждающие сообщения 
	* Заполняет поля и сообщения скрываются
