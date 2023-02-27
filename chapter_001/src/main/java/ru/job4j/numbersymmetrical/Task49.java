package ru.job4j.numbersymmetrical;

public class Task49 {
    public static void isPalindrome(int number) {
        String val = String.valueOf(number);

        char x = val.charAt(0);
        char x1 = val.charAt(val.length() - 1);

        for (int i = val.length() - x; i < val.length() - x1; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        isPalindrome(4324);
    }
}

