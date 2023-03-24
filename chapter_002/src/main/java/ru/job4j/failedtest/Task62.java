package ru.job4j.failedtest;

public class Task62 {
    public static void loop(int amount, int[] grades) {
        int count = 0;
        for (int i = grades[0]; i < grades.length; i++) {
            if (grades[i] < 3) {
                count += 0;
            } else if (grades[i] > 3) {
                count++;
            }
            if (count > 2) {
                System.out.println("Да");
            } else if (count < 2) {
                System.out.println("Нет");
            }
        }
    }
}
