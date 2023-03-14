package ru.job4j.checkingnumofchairsforstud;

public class Task34 {
    public static void chairsCheck(int pupils, int chairs) {
        int num1, num2;
        num2 = chairs % 10;
        num1 = pupils % 10;

        if (pupils == chairs) {
            System.out.println("Соответствует");
        } else if (num1 > num2) {
            System.out.println("Не хватает стульев: " + num1);
        } else if (num1 < num2) {
            System.out.println("Лишних стульев: " + num2);
        }
    }
}
