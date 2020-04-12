package com.technoserv.AbstractVector;

public class Vector2d extends AbstractVector<Vector2d> {
    private double x, y;

    //Конструктор класса Vector2d
    public Vector2d(double x, double y){
        this.x = x;
        this.y = y;
    }

    //Получение значения 'x'
    public double getX() { return x; }

    //Получение значения 'y'
    public double getY() { return y; }

    @Override
    public double getZ() {
        return 0;
    }

    //Сложение двумерных векторов
    public Vector2d addVec(AbstractVector<Vector2d> vec){
        return new Vector2d(
                this.getX() + vec.getX(),
                this.getY() + vec.getY()
        );
    }

    //Вычитание двумерных векторов
    public Vector2d subVec(AbstractVector<Vector2d> vec){
        return new Vector2d(
                this.getX() - vec.getX(),
                this.getY() - vec.getY()
        );
    }

    @Override
    public Vector2d vectorMultip(AbstractVector<Vector2d> vec) {
        return null;
    }

    //Скалярное произведение двумерных векторов
    public double scalarMultip(AbstractVector<Vector2d> vec){
        return x * vec.getX() + y * vec.getY();
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