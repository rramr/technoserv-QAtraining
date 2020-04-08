package com.technoserv.AbstractVector;

public class Vector2d extends AbstractVector2d {
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

    //Сложение двумерных векторов
    public Vector2d addVec(Vector2d vec){
        return new Vector2d(
                this.getX() + vec.getX(),
                this.getY() + vec.getY()
        );
    }

    //Вычитание двумерных векторов
    public Vector2d subVec(Vector2d vec){
        return new Vector2d(
                this.getX() - vec.getX(),
                this.getY() - vec.getY()
        );
    }

    //Скалярное произведение двумерных векторов
    public double scalarMultip(Vector2d vec){
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
