# Реализация на C#

### Структура

- Класс Main - [Program.cs](technoserv-day2task-AbstractVector/technoserv-day2task-AbstractVector/Program.cs "Program.cs")
- Абстрактный класс AbstractVector - [AbstractVector.cs](technoserv-day2task-AbstractVector/technoserv-day2task-AbstractVector/AbstractVector.cs "AbstractVector.cs")
- Класс Vector2d - [Vector2d.cs](technoserv-day2task-AbstractVector/technoserv-day2task-AbstractVector/Vector2d.cs "Vector2d.cs")
- Класс Vector3d - [Vector3d.cs](technoserv-day2task-AbstractVector/technoserv-day2task-AbstractVector/Vector3d.cs "Vector3d.cs")

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
- Векторное произведение трёхмерных векторов: `[-7.0, 3.0, 1.0]`
- Скалярное произведение двумерных векторов: `23.0`