package com.technoserv.AbstractVector;

public class Vector2d extends AbstractVector {
    private double x, y;

    //Конструктор класса Vector2d
    public Vector2d(double x, double y){
        this.x = x;
        this.y = y;
    }

    //Получение значения 'x'
    public double getX() {
        return x;
    }

    //Получение значения 'y'
    public double getY() {
        return y;
    }

    //Пустое значение 'z' для совместной работы с классом Vector3d(3 переменных в конструкторе) через абстрактный класс
    @Override
    public double getZ() {
        return 0;
    }

    //Сложение двумерных векторов
    public double[] addVec(double x2, double y2, double z2){
        double[] newVec = {x + x2, y + y2};
        return newVec;
    }

    //Вычитание двумерных векторов
    public double[] subVec(double x2, double y2, double z2){
        double[] newVec = {x - x2, y - y2};
        return newVec;
    }

    //Скалярное произведение двумерных векторов
    public double scalarMultip(double x2, double y2, double z2){
        return x * x2 + y * y2;
    }

    //Векторное произведение двумерных векторов
    public double[] vectorMultip(double x, double y, double z){
        return null;
    }

    //Вывод вектора
    @Override
    public String toString() {
        return "Vector2d{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
