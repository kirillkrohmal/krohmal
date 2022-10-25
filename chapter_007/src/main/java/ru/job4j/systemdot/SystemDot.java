package ru.job4j.systemdot;

import java.util.Scanner;

public class SystemDot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        double d = 0;
        double sum = 0;

        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                d = scanner.nextDouble();
                sum += d;
             } else {
                scanner.next();
            }

            if (n == 2) {
                break;
            }
            n++;
        }
        System.out.printf("summa: %.6f", sum);
    }
}
