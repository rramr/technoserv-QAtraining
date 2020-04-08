namespace technoserv_day2task_AbstractVector
{
    abstract class AbstractVector
    {
        public double x { get; protected set; }
        public double y { get; protected set; }
        public double z { get; protected set; }
        public abstract double getX();
        public abstract double getY();
        public abstract double getZ();
        public abstract string toString();

        public abstract double[] addVec(double x, double y, double z);
        public abstract double[] subVec(double x, double y, double z);
        public abstract double[] vectorMultip(double x, double y, double z);
        public abstract double scalarMultip(double x, double y, double z);
    }
}
