package com.technoserv.AbstractVector;

public class Vector3d extends AbstractVector {
    private double x, y, z;

    //Конструктор класса Vector3d
    public Vector3d(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //Получение значения 'x'
    public double getX() {
        return x;
    }

    //Получение значения 'y'
    public double getY() {
        return y;
    }

    //Получение значения 'z'
    public double getZ() {
        return z;
    }

    //Сложение трёхмерных векторов
    public double[] addVec(double x2, double y2, double z2){
        double[] newVec = {x + x2, y + y2, z + z2};
        return newVec;
    }

    //Вычитание трёхмерных векторов
    public double[] subVec(double x2, double y2, double z2){
        double[] newVec = {x - x2, y - y2, z - z2};
        return newVec;
    }

    //Векторное произведение трёхмерных векторов
    public double[] vectorMultip(double x2, double y2, double z2){
        double[] newVec = {
                y * z2 - z * y2,
                -(x * z2 - z * x2),
                x * y2 - y * x2
        };
        return newVec;
    }

    //Скалярное произведение трёхмерных векторов
    public double scalarMultip(double x2, double y2, double z2){
        return x * x2 + y * y2 + z * z2;
    }

    //Вывод вектора
    @Override
    public String toString() {
        return "Vector3d{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
