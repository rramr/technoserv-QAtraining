package com.technoserv.AbstractVector;

public class Vector3d extends AbstractVector3d {
    private double x, y, z;

    //Конструктор класса Vector3d
    public Vector3d(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //Получение значения 'x'
    public double getX() { return x; }

    //Получение значения 'y'
    public double getY() {
        return y;
    }

    //Получение значения 'z'
    public double getZ() {
        return z;
    }

    //Сложение трёхмерных векторов
    public Vector3d addVec(Vector3d vec){
        return new Vector3d(
                this.getX() + vec.getX(),
                this.getY() + vec.getY(),
                this.getZ() + vec.getZ());
    }

    //Вычитание трёхмерных векторов
    public Vector3d subVec(Vector3d vec){
        return new Vector3d(
                this.getX() - vec.getX(),
                this.getY() - vec.getY(),
                this.getZ() - vec.getZ());
    }

    //Векторное произведение трёхмерных векторов
    public Vector3d vectorMultip(Vector3d vec){
        double newX = this.getY() * vec.getZ() - this.getZ() * vec.getY();
        double newY = - (this.getX() * vec.getZ() - this.getZ() * vec.getX());
        double newZ = this.getX() * vec.getY() - this.getY() * vec.getX();
        return new Vector3d(newX, newY, newZ);
    }

    //Скалярное произведение трёхмерных векторов
    public double scalarMultip(Vector3d vec){
        return  this.getX() * vec.getX() +
                this.getY() * vec.getY() +
                this.getZ() * vec.getZ();
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