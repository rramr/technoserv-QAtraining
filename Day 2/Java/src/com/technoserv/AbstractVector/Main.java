package com.technoserv.AbstractVector;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Вызов конструктора классов для двумерных векторов
        AbstractVector first2d = new Vector2d(3, 2);
        AbstractVector second2d = new Vector2d(5, 4);

        //Вызов конструктора классов для трёхмерных векторов
        AbstractVector first3d = new Vector3d(2, 3, 5);
        AbstractVector second3d = new Vector3d(1, 2, 1);

        //Вывод результата сложения двумерных векторов
        System.out.println("Сложение векторов: " +
                Arrays.toString(
                        first2d.addVec(second2d.getX(), second2d.getY(), second2d.getZ())
                )
        );

        //Вывод результата вычитания трёхмерных векторов
        System.out.println("Вычитание векторов: " +
                Arrays.toString(
                        first3d.addVec(second3d.getX(), second3d.getY(), second3d.getZ())
                )
        );

        //Вывод результата векторного произведения трёхмерных векторов
        System.out.println("Векторное произведение: " +
                Arrays.toString(
                        first3d.vectorMultip(second3d.getX(), second3d.getY(), second3d.getZ())
                )
        );

        //Вывод результата скалярного произведения двумерных векторов
        System.out.println("Скалярное произведение: " + first2d.scalarMultip(second2d.getX(), second2d.getY(), second2d.getZ()));
    }
}
