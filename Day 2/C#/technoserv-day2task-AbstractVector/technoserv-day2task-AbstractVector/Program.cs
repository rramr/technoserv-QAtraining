using System;

namespace technoserv_day2task_AbstractVector
{
    class Program
    {
        static void Main(string[] args)
        {
            //Вызов конструктора классов для двумерных векторов
            AbstractVector2d first2d = new Vector2d(3, 2);
            Vector2d second2d = new Vector2d(5, 4);

            //Вызов конструктора классов для трёхмерных векторов
            AbstractVector3d first3d = new Vector3d(2, 3, 5);
            Vector3d second3d = new Vector3d(1, 2, 1);

            Console.WriteLine("Сложение векторов: " + first2d.addVec(second2d).toString());
            Console.WriteLine("Вычитание векторов: " + first3d.subVec(second3d).toString());
            Console.WriteLine("Векторное произведение: " + first3d.vectorMultip(second3d).toString());
            Console.WriteLine("Скалярное произведение: " + first2d.scalarMultip(second2d));
        }
    }
}
