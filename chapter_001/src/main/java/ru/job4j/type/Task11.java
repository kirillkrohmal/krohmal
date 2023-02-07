package ru.job4j.type;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double centimeters = input.nextInt();
        double inches = centimeters/2.54;
        System.out.printf("%.2f", inches);
    }
}
