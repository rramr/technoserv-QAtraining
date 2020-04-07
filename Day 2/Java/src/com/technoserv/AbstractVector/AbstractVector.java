package com.technoserv.AbstractVector;

import java.util.Vector;

public abstract class AbstractVector {
    public abstract double getX();
    public abstract double getY();
    public abstract double getZ();

    public abstract double[] addVec(double x, double y, double z);
    public abstract double[] subVec(double x, double y, double z);
    public abstract double[] vectorMultip(double x, double y, double z);
    public abstract double scalarMultip(double x, double y, double z);
}
