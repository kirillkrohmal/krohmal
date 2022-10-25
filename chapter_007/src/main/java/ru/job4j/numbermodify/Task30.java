package ru.job4j.numbermodify;

public class Task30 {
    public static void numModify(int number) {
        if (number <= 0) {
            number = number * -1;
            System.out.println(number);
        } else if (number > 0) {
            number = number * +1;
            System.out.println(number);
        }
    }
}
