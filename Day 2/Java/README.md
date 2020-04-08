# Реализация на Java

### Структура

- Класс Main - [Main.java](src/com/technoserv/AbstractVector/Main.java "Main.java")
- Абстрактный класс AbstractVector2d - [AbstractVector2d.java](src/com/technoserv/AbstractVector/AbstractVector2d.java "AbstractVector2d.java")
- Абстрактный класс AbstractVector3d - [AbstractVector3d.java](src/com/technoserv/AbstractVector/AbstractVector3d.java "AbstractVector3d.java")
- Класс Vector2d - [Vector2d.java](src/com/technoserv/AbstractVector/Vector2d.java "Vector2d.java")
- Класс Vector3d - [Vector3d.java](src/com/technoserv/AbstractVector/Vector3d.java "Vector3d.java")

### Тестовые данные

#### Двумерные векторы:

```
x = 3, y = 2
x = 5, y = 4
```

#### Трёхмерные векторы:

```
x = 2, y = 3, z = 5
x = 1, y = 2, z = 1
```

### Результаты:

- Сложение двумерных векторов: `[8.0, 6.0]`
- Вычитание трёхмерных векторов: `[1.0, 1.0, 4.0]`
- Векторное трёхмерных произведение: `[-7.0, 3.0, 1.0]`
- Скалярное двумерных произведение: `23.0`