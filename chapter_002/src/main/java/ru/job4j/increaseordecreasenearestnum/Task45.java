package ru.job4j.increaseordecreasenearestnum;

public class Task45 {
    public static void changeToRoundNum(int number) {
        boolean num = number % 2 == 0;
        int num2 = 0;

        if (number % 10 == 0){
            System.out.println("Без изменений");
        } else  if (num) {
            if (number % 10 > 0 && number % 10 < 5) {
                num2 = number + (10 - number % 10);
                System.out.println("Увеличено до " + num2);
            }
        } else if (!num) {
            if (number % 10 >= 3) {
                num2 = number - (number % 10);
                System.out.println("Уменьшено до " + num2);
            }
        }
    }
}
