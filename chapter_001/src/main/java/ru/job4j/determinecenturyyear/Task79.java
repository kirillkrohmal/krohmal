package ru.job4j.determinecenturyyear;

public class Task79 {
    public static void getCentury(int num) {
        if (num < 1499 || num >= 2022) {
            System.out.println("Не попадает в диапазон");
        } else if (num > 1500 && num <= 1600) {
            System.out.println("16");
        } else if (num > 1600 && num <= 1700) {
            System.out.println("17");
        } else if (num > 1700 && num <= 1800) {
            System.out.println("18");
        } else if (num > 1800 && num <= 1900) {
            System.out.println("19");
        } else if (num > 1900 && num <= 2020) {
            System.out.println("20");
        }
    }
}
