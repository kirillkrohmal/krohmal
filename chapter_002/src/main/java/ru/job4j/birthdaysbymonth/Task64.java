package ru.job4j.birthdaysbymonth;

public class Task64 {
    public static void loop(int[] months) {
        int winter = 0;
        int spring = 0;
        int summer = 0;
        int fall = 0;

        for (int i = months[0]; i < months.length; i++) {
            if(months[i] == 12 && months[i] == 1 && months[i] == 2) {
                winter++;
            } else if (months[i] == 3 && months[i] == 4 && months[i] == 5) {
                spring++;
            } else if (months[i] == 6 && months[i] == 7 && months[i] == 8) {
                summer++;
            } else if (months[i] == 9 && months[i] == 10 && months[i] == 11) {
                fall++;
            }
        } System.out.println("Зимой: " + winter + ", Весной: " + spring + ", Летом: " + summer + ", Осенью: " + fall);
    }
}
