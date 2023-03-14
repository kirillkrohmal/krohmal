package ru.job4j.displaytextformeval;

public class Task64 {
    public static void gradePrint(int number) {
        if (number == 1 || number == 2) {
            System.out.println("Плохо");
        } else if (number == 3) {
            System.out.println("Удовлетворительно");
        } else if (number == 4) {
            System.out.println("Хорошо");
        } else if (number == 5) {
            System.out.println("Отлично");
        } else {
            System.out.println("Не соответствует");
        }
    }
}
