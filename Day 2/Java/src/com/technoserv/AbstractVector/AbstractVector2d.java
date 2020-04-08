package com.technoserv.AbstractVector;

public abstract class AbstractVector2d {
    public abstract double getX();
    public abstract double getY();
    public abstract String toString();

    public abstract Vector2d addVec(Vector2d vec);
    public abstract Vector2d subVec(Vector2d vec);
    public abstract double scalarMultip(Vector2d vec);
}
