package com.technoserv.AbstractVector;

public class Main {
    public static void main(String[] args) {
        //Инициализация дженериков для векторов
        AbstractVector<Vector2d> first2d = new Vector2d(3, 2);
        AbstractVector<Vector2d> second2d = new Vector2d(5, 4);
        AbstractVector<Vector3d> first3d = new Vector3d(2, 3, 5);
        AbstractVector<Vector3d> second3d = new Vector3d(1, 2, 1);

        //Вывод результатов
        System.out.println("Сложение векторов: " + first2d.addVec(second2d).toString());
        System.out.println("Вычитание векторов: " + first3d.subVec(second3d).toString());
        System.out.println("Векторное произведение: " + first3d.vectorMultip(second3d).toString());
        System.out.println("Скалярное произведение: " + first2d.scalarMultip(second2d));
    }
}