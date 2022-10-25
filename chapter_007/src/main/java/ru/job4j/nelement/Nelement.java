package ru.job4j.nelement;

public class Nelement {
    public static void main(String[] args) {
        int n = 0;
        int b = 0;

        int[] array = {0, 1, 3, 4, 6, 6};

        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[i] == array[j]) {
                    b = array[i];
                    n++;
                }
            }
        }
        System.out.println(b);
    }
}
