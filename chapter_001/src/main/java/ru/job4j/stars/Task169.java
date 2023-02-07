package ru.job4j.stars;

import java.util.Scanner;

public class Task169 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int columnCount = in.nextInt();
        String star = "*";
        String space = " ";

        for (int i = 1; i <= columnCount; i++) {

            for (int j = 1; j <= columnCount; j++) {
                if (i == 1 || i == columnCount
                        || j == i || j == columnCount - i + 1) {
                    System.out.print(star);
                }
                else{
                    System.out.print(space);
                }
            }
        }
    }
}
