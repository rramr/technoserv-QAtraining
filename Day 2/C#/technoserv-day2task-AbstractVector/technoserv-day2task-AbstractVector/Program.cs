using System;

namespace technoserv_day2task_AbstractVector
{
    class Program
    {
        static void Main(string[] args)
        {
            //Инициализация дженериков для векторов
            AbstractVector<Vector2d> first2d = new Vector2d(3, 2);
            AbstractVector<Vector2d> second2d = new Vector2d(5, 4);
            AbstractVector<Vector3d> first3d = new Vector3d(2, 3, 5);
            AbstractVector<Vector3d> second3d = new Vector3d(1, 2, 1);

            //Вывод результатов
            Console.WriteLine("Сложение двумерных векторов: " + first2d.addVec(second2d).toString());
            Console.WriteLine("Вычитание трёхмерных векторов: " + first3d.subVec(second3d).toString());
            Console.WriteLine("Векторное произведение трёхмерных произведение: " + first3d.vectorMultip(second3d).toString());
            Console.WriteLine("Скалярное произведение двумерных векторов: " + first2d.scalarMultip(second2d));
        }
    }
}
