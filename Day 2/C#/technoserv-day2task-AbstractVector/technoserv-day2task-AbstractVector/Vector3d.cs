using System;

namespace technoserv_day2task_AbstractVector
{
    class Vector3d : AbstractVector<Vector3d>
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
        public override double getX() { return x; }

        //Получение значения 'y'
        public override double getY() { return y; }

        //Получение значения 'z'
        public override double getZ() { return z; }

        //Сложение трёхмерных векторов
        public override Vector3d addVec(AbstractVector<Vector3d> vec)
        {
            return new Vector3d(
                this.getX() + vec.getX(),
                this.getY() + vec.getY(),
                this.getZ() + vec.getZ()
                );
        }

        //Вычитание трёхмерных векторов
        public override Vector3d subVec(AbstractVector<Vector3d> vec)
        {
            return new Vector3d(
                this.getX() - vec.getX(),
                this.getY() - vec.getY(),
                this.getZ() - vec.getZ()
                );
        }

        //Векторное произведение трёхмерных векторов
        public override Vector3d vectorMultip(AbstractVector<Vector3d> vec)
        {
            double newX = this.getY() * vec.getZ() - this.getZ() * vec.getY();
            double newY = -(this.getX() * vec.getZ() - this.getZ() * vec.getX());
            double newZ = this.getX() * vec.getY() - this.getY() * vec.getX();
            return new Vector3d(newX, newY, newZ);
        }

        //Скалярное произведение трёхмерных векторов
        public override double scalarMultip(AbstractVector<Vector3d> vec)
        {
            return
                this.getX() * vec.getX() +
                this.getY() * vec.getY() +
                this.getZ() * vec.getZ();
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
