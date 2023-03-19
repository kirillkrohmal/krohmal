package ru.job4j.determinetypetriangle;

public class Task57 {
    public static void triangleType(int a, int b) {
        if (a < 90 && b < 90) {
            System.out.println("Остроугольный");
        } else if (a == 90 || b == 90) {
            System.out.println("Прямоугольный");
        } else if (a > 90 || b > 90) {
            System.out.println("Тупоугольный");
        } else if (a == b) {
            System.out.println("Равнобедренный");
        } else if (a == 60 && b == 60) {
            System.out.println("Равнобедренный прямоугольный");
        } else if (a == 60 && b == 60) {
            System.out.println("Равносторонний");
        }
    }
}


