package com.technoserv.AbstractVector;

public abstract class AbstractVector3d {
    public abstract double getX();
    public abstract double getY();
    public abstract double getZ();
    public abstract String toString();

    public abstract Vector3d addVec(Vector3d vec);
    public abstract Vector3d subVec(Vector3d vec);
    public abstract Vector3d vectorMultip(Vector3d vec);
    public abstract double scalarMultip(Vector3d vec);
}