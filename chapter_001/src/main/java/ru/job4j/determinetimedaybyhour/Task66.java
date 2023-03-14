package ru.job4j.determinetimedaybyhour;

public class Task66 {
    public static void daytime(int number) {
        if (number == 23 || number == 5 || number == 0) {
            System.out.println("Ночь");
        } else if (number >= 6 && number <= 10) {
            System.out.println("Утро");
        } else if (number >= 11 && number <= 17) {
            System.out.println("День");
        } else if (number >= 18 && number <= 22) {
            System.out.println("Вечер");
        } else {
            System.out.println("Не является часом");
        }
    }
}
