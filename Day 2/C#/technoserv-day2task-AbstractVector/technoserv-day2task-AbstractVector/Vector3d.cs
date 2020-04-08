using System;

namespace technoserv_day2task_AbstractVector
{
    class Vector3d : AbstractVector
    {
        private new double x, y, z;

        //Конструктор класса Vector3d
        public Vector3d(double x, double y, double z)
        {
            this.x = x;
            this.y = y;
            this.z = z;
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

        //Получение значения 'z'
        public override double getZ()
        {
            return z;
        }

        //Сложение трёхмерных векторов
        public override double[] addVec(double x2, double y2, double z2)
        {
            double[] newVec = { x + x2, y + y2, z + z2 };
            return newVec;
        }

        //Вычитание трёхмерных векторов
        public override double[] subVec(double x2, double y2, double z2)
        {
            double[] newVec = { x - x2, y - y2, z - z2 };
            return newVec;
        }

        //Векторное произведение трёхмерных векторов
        public override double[] vectorMultip(double x2, double y2, double z2)
        {
            double[] newVec = {
                y * z2 - z * y2,
                -(x * z2 - z * x2),
                x * y2 - y * x2
            };
            return newVec;
        }

        //Скалярное произведение трёхмерных векторов
        public override double scalarMultip(double x2, double y2, double z2)
        {
            return x * x2 + y * y2 + z * z2;
        }

        //Вывод вектора
        public override String toString()
        {
            return "Vector3d{" +
                    "x=" + x +
                    ", y=" + y +
                    ", z=" + z +
                    '}';
        }
    }
}
