## Задание 2

> Здание имеет 10 этажей и парковку. В здании есть лифт, ездящий на нечётные этажи и второй этаж Какие тест-кейсы вы бы предложили? Какие вопросы вы бы задали аналитику перед разработкой тест-кейсов?

**Вопросы аналитику:** Завершена ли работа над требованиями к ПО? С парковки можно уехать на лифте? Если да, то под каким номером обозначена парковка? (условно -1) Если по спецификации вопросов нет, требования описаны в полном объёме, то можно присту-пать к написанию тест-кейсов на основе спецификации.

### Test-case

| Номер | Заголовок  | Предусловие  |
|:----------|:----------|:----------|
| ex2   | Вводим этаж | Запускаем консоль управления лифтом |

**Шаги:**
- Отправляем команду на перемещение лифта на указанный этаж

| Вводимое значение | Ожидаемый результат |
|:----------|:----------|
| 10 (проверяем граничные значения) | Ошибка – «Чётный этаж» |
| 11 и больше | Ошибка – «Этаж отсутствует» |
| -1 | Положительный - парковка |
| -2 и меньше | Ошибка – «Этаж отсутствует» |
| 0 | Ошибка – «Этаж отсутствует» |
| 2 | Положительный – второй этаж |
| Нечётное число от -1 до 9 | 	Положительный – доступ на этаж |
| Чётное число от 4 до 10 | Ошибка – «Чётный этаж» |
| Пустые поля | Ошибка – «Поля не могут быть пустыми» | 
| Ввод несовместимых символов | Ошибка – «Введите число» |

Вернуться [назад](../Day%201)