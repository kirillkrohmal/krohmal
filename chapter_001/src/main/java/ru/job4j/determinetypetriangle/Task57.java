package ru.job4j.determinetypetriangle;

public class Task57 {
    public static void triangleType(int a, int b) {
        if (a + b >= 180 || a <= 0 || b <= 0) {
            System.out.println("Ошибка");
            return;
        }
        double c = (a + b) - 180;

        if (a == 90 || b == 90 || c == 90) {
            System.out.println("Прямоугольный");
        }
        if (a < 90 && b < 90 && c < 90) {
            System.out.println("Остроугольный");
        }
        if (a > 90 || b > 90 || c > 90) {
            System.out.println("Тупоугольный");
        }
        if (a == b || a == c || b == c) {
            System.out.println("Равнобедренный");
        }
        if ((a == b && b == c) && (a == c && b == c)) {
            System.out.println("Равносторонний");
        }
        if ((a == 45 && b == 45) || (b == 45 && c == 45) || (a == 45 && c == 45)) {
            System.out.println("Равнобедренный прямоугольный");
        }
    }
}


