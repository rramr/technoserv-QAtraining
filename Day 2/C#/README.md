# Реализация на C#

### Структура

- Класс Main - [Program.cs](technoserv-day2task-AbstractVector/technoserv-day2task-AbstractVector/Program.cs "Program.cs")
- Абстрактный класс AbstractVector2d - [AbstractVector2d.cs](technoserv-day2task-AbstractVector/technoserv-day2task-AbstractVector/AbstractVector2d.cs "AbstractVector2d.cs")
- Абстрактный класс AbstractVector3d - [AbstractVector3d.cs](technoserv-day2task-AbstractVector/technoserv-day2task-AbstractVector/AbstractVector3d.cs "AbstractVector3d.cs")
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
- Векторное трёхмерных произведение: `[-7.0, 3.0, 1.0]`
- Скалярное двумерных произведение: `23.0`