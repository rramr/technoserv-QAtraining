## Задание 1
> Есть программа, которая принимает с консоли три числа a, b, c и возвращает действи-тельные корни уравнения a*x^2+b*x+c=0. Какие тест кейсы вы бы предложили для тести-рования такой программы? Какие вопросы вы бы задали аналитику перед разработкой тест-кейсов?

**Вопросы аналитику:** Завершена ли работа над требованиями к ПО? Какие цели проекта и какая предметная область? Если по спецификации вопросов нет, требования описаны в полном объёме, то можно приступать к написанию тест-кейсов на основе спецификации.

### Test-case

| Номер | Заголовок  | Предусловие  |
|:----------|:----------|:----------|
| ex1   | Вводим в консоль три числа a, b, и c | Запустить программу |

**Шаги:**
- Вводим число a
- Вводим число b
- Вводим число c

| Вводимое значение | Ожидаемый результат   |
|:----------|:----------|
| a=1; b=-8; c=12 | Дискриминант положительный, решение есть (два корня) | 
| a = 5; b = 3; c = 7 | Дискриминант отрицательный, корней нет | 
| a = 1; b = −6; c = 9 | Дискриминант равен нулю, решение есть (один корень) | 
| a=0; b=-5; c=2 | Ошибка – «Решения нет, ‘a’  не может быть равен нулю» | 
| Пустые поля | Ошибка – «Поля не могут быть пустыми» | 
| Ввод несовместимых символов | Ошибка – «Введите число» |

Вернуться [назад](../Day%201)