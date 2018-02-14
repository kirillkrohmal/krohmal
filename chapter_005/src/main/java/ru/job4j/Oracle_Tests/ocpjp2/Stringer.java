package ru.job4j.Oracle_Tests.ocpjp2;

/**
 * Created by Comp on 13.02.2018.
 */
public class Stringer {
    public static void main(String[] args) {
        String s = "1 032,12";

        double d = Double.parseDouble(s);
        double d2 = 1032.12;

        System.out.println("Число: " + d);

    }
}
