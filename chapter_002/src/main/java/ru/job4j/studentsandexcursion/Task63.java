package ru.job4j.studentsandexcursion;

public class Task63 {
    public static void loop(int[] answers) {
        int count = 0;
        String s1 = "Да";
        String s2 = "Нет";
        for (int i = 0; i < answers.length; i++) {
            if(answers[i] == 1) {
                count++;
            } else if (answers[i] == 0) {
                count+=0;
            }
        } if (count >= 4) {
            System.out.println(count + ", " + s1);
        } else if (count < 4) {
            System.out.println(count + ", " + s2);
        }
    }
}
