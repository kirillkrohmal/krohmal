package ru.job4j.increasedecreasenearestroundnum;

public class Task45 {
    public static void changeToRoundNum(int number) {

        boolean num = number % 2 == 0;
        int num2 = number % 10;
        if (num) {
            System.out.println("Увеличено до " + number);
        } else if (!num) {
            System.out.println("Уменьшено до " + number);
        } else if (num2 < 1){
            System.out.println("Без изменений");
        }
    }
}
