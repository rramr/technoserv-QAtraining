using System;

namespace technoserv_day2task_AbstractVector
{
    class Vector2d : AbstractVector2d
    {
        private new double x, y;

        //Конструктор класса Vector2d
        public Vector2d(double x, double y)
        {
            this.x = x;
            this.y = y;
        }

        //Получение значения 'x'
        public override double getX() { return x; }

        //Получение значения 'y'
        public override double getY() { return y; }


        //Сложение двумерных векторов
        public override Vector2d addVec(Vector2d vec)
        {
            return new Vector2d(
                this.getX() + vec.getX(),
                this.getY() + vec.getY()
                );
        }

        //Вычитание двумерных векторов
        public override Vector2d subVec(Vector2d vec)
        {
            return new Vector2d(
                this.getX() - vec.getX(),
                this.getY() - vec.getY()
                );
        }

        //Скалярное произведение двумерных векторов
        public override double scalarMultip(Vector2d vec)
        {
            return x * vec.getX() + y * vec.getY();
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
