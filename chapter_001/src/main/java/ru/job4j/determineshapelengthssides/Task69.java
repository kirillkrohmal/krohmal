package ru.job4j.determineshapelengthssides;

public class Task69 {
    public static void squareOrRectangle(int a, int b) {
        if (a < b || a > b) {
            System.out.println("Прямоугольник");
        } else if (a == b) {
            System.out.println("Квадрат");
        }
    }
}
