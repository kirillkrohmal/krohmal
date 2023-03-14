package ru.job4j.gettimeofyearmonthnum;

public class Task65 {
    public static void season(int number) {

        if (number > 0 && number < 3 || number == 12) {
            System.out.println("Зима");
        } else if (number >= 3 && number < 6) {
            System.out.println("Весна");
        } else if (number >= 6 && number < 9) {
            System.out.println("Лето");
        } else if (number >= 9 && number <= 11) {
            System.out.println("Осень");
        } else {
            System.out.println("Не является месяцем");
        }

    }
}
