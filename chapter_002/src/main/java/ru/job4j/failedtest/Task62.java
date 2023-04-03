package ru.job4j.failedtest;

public class Task62 {
    public static void loop(int amount, int[] grades) {
        int count = 0;
        for (int grade : grades) {
            if (grade >= 3) {
                count++;
            }
        }
        if (count <= 2 && amount == 5) {
            System.out.println("Да");
        } else if (count >= 3 || amount == 4) {
            System.out.println("Нет");
        }
    }
}
