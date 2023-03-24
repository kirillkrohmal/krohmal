package ru.job4j.studentsandexcursion;

public class Task63 {
    public static void loop(int[] answers) {
        int count = 0;
        String s1 = null;
        for (int i = answers[0]; i < answers.length - 1; i++) {
            if(answers[i] == 1) {
                count++;
                s1 = "Да";
            } else if (answers[i] == 0) {
                count+=0;
                s1 = "Нет";
            }
        } System.out.println(count + ", " + s1);
    }
}
