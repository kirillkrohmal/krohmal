package ru.job4j.processstudentgrades;

public class Task79 {
    public static void loop(int[] grades) {
        double avg;
        int bad;
        int sum;


        for (int i = 0; i < grades.length; i++) {
            sum = grades[i];
            avg = sum / 5;

            System.out.println(avg);
        }
    }

    public static void main(String[] args) {
        int[] sum = new int[]{3, 4, 2, 3, 5};

        loop(sum);
    }
}
