using System;

namespace technoserv_day2task_AbstractVector
{
    class Vector2d : AbstractVector<Vector2d>
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
        public override Vector2d addVec(AbstractVector<Vector2d> vec)
        {
            return new Vector2d(
                this.getX() + vec.getX(),
                this.getY() + vec.getY()
                );
        }

        //Вычитание двумерных векторов
        public override Vector2d subVec(AbstractVector<Vector2d> vec)
        {
            return new Vector2d(
                this.getX() - vec.getX(),
                this.getY() - vec.getY()
                );
        }

        //Скалярное произведение двумерных векторов
        public override double scalarMultip(AbstractVector<Vector2d> vec)
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

        //Исключение нереализованного getZ()
        public override double getZ()
        {
            throw new NotImplementedException();
        }

        //Исключение нереализованного vectorMultip()
        public override Vector2d vectorMultip(AbstractVector<Vector2d> vec)
        {
            throw new NotImplementedException();
        }
    }
}
