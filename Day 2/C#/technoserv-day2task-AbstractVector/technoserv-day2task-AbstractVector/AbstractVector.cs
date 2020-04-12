namespace technoserv_day2task_AbstractVector
{
    abstract class AbstractVector<T>
    {
        public double x { get; protected set; }
        public double y { get; protected set; }
        public double z { get; protected set; }

        public abstract double getX();
        public abstract double getY();
        public abstract double getZ();
        public abstract string toString();

        public abstract T addVec(AbstractVector<T> vec);
        public abstract T subVec(AbstractVector<T> vec);
        public abstract T vectorMultip(AbstractVector<T> vec);
        public abstract double scalarMultip(AbstractVector<T> vec);
    }
}
