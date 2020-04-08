package com.technoserv.AbstractVector;

public class Main {
    public static void main(String[] args) {
        //Вызов конструктора классов для двумерных векторов
        AbstractVector2d first2d = new Vector2d(3, 2);
        Vector2d second2d = new Vector2d(5, 4);

        //Вызов конструктора классов для трёхмерных векторов
        AbstractVector3d first3d = new Vector3d(2, 3, 5);
        Vector3d second3d = new Vector3d(1, 2, 1);

        //Вывод результата сложения двумерных векторов
        System.out.println("Сложение векторов: " + first2d.addVec(second2d).toString());

        //Вывод результата вычитания трёхмерных векторов
        System.out.println("Вычитание векторов: " + first3d.subVec(second3d).toString());

        //Вывод результата векторного произведения трёхмерных векторов
        System.out.println("Векторное произведение: " + first3d.vectorMultip(second3d).toString());

        //Вывод результата скалярного произведения двумерных векторов
        System.out.println("Скалярное произведение: " + first2d.scalarMultip(second2d));
    }
}
