namespace technoserv_day2task_AbstractVector
{
    abstract class AbstractVector2d
    {
        public double x { get; protected set; }
        public double y { get; protected set; }
        public abstract double getX();
        public abstract double getY();
        public abstract string toString();

        public abstract Vector2d addVec(Vector2d vec);
        public abstract Vector2d subVec(Vector2d vec);
        public abstract double scalarMultip(Vector2d vec);
    }
}
