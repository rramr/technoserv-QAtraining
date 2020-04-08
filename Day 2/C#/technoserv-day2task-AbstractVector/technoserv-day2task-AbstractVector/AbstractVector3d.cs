namespace technoserv_day2task_AbstractVector
{
    abstract class AbstractVector3d
    {
        public double x { get; protected set; }
        public double y { get; protected set; }
        public double z { get; protected set; }
        public abstract double getX();
        public abstract double getY();
        public abstract double getZ();
        public abstract string toString();

        public abstract Vector3d addVec(Vector3d vec);
        public abstract Vector3d subVec(Vector3d vec);
        public abstract Vector3d vectorMultip(Vector3d vec);
        public abstract double scalarMultip(Vector3d vec);
    }
}
