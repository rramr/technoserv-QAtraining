using System;

namespace technoserv_day2task_AbstractVector
{
    class Vector2d : AbstractVector
    {
        private new double x, y;

        //Конструктор класса Vector2d
        public Vector2d(double x, double y)
        {
            this.x = x;
            this.y = y;
        }

        //Получение значения 'x'
        public override double getX()
        {
            return x;
        }

        //Получение значения 'y'
        public override double getY()
        {
            return y;
        }

        //Пустое значение 'z' для совместной работы с классом Vector3d(3 переменных в конструкторе) через абстрактный класс
        public override double getZ()
        {
            return 0;
        }

        //Сложение двумерных векторов
        public override double[] addVec(double x2, double y2, double z2)
        {
            double[] newVec = { x + x2, y + y2 };
            return newVec;
        }

        //Вычитание двумерных векторов
        public override double[] subVec(double x2, double y2, double z2)
        {
            double[] newVec = { x - x2, y - y2 };
            return newVec;
        }

        //Скалярное произведение двумерных векторов
        public override double scalarMultip(double x2, double y2, double z2)
        {
            return x * x2 + y * y2;
        }

        //Векторное произведение двумерных векторов
        public override double[] vectorMultip(double x, double y, double z)
        {
            return null;
        }

        //Вывод вектора
        public override String toString()
        {
            return "Vector2d{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
}
