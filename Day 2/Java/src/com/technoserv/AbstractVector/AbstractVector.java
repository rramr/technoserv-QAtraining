package com.technoserv.AbstractVector;

public abstract class AbstractVector<T> {
    public abstract double getX();
    public abstract double getY();
    public abstract double getZ();
    public abstract String toString();

    public abstract T addVec(AbstractVector<T> vec);
    public abstract T subVec(AbstractVector<T> vec);
    public abstract T vectorMultip(AbstractVector<T> vec);
    public abstract double scalarMultip(AbstractVector<T> vec);
}