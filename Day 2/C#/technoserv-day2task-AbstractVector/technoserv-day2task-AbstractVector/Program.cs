using System;

namespace technoserv_day2task_AbstractVector
{
    class Program
    {
        static void Main(string[] args)
        {
            //Вызов конструктора классов для двумерных векторов
            AbstractVector first2d = new Vector2d(3, 2);
            AbstractVector second2d = new Vector2d(5, 4);

            //Вызов конструктора классов для трёхмерных векторов
            AbstractVector first3d = new Vector3d(2, 3, 5);
            AbstractVector second3d = new Vector3d(1, 2, 1);

            Console.WriteLine("Сложение векторов: " + string.Join(", ", first2d.addVec(second2d.getX(), second2d.getY(), second2d.getZ())));
            Console.WriteLine("Вычитание векторов: " + string.Join(", ", first3d.addVec(second3d.getX(), second3d.getY(), second3d.getZ())));
            Console.WriteLine("Векторное произведение: " + string.Join(", ", first3d.vectorMultip(second3d.getX(), second3d.getY(), second3d.getZ())));
            Console.WriteLine("Скалярное произведение: " + string.Join(", ", first2d.scalarMultip(second2d.getX(), second2d.getY(), second2d.getZ())));
        }
    }
}
