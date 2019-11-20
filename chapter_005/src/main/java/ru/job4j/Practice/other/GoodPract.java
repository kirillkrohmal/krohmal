package ru.job4j.Practice.other;

import java.io.IOException;

/**
 * Created by Comp on 16.11.2017.
 */
public class GoodPract {

    private static int a;
    private static int b;
    private static StackTraceElement e;

    public void SomeChoice(int a) {
        System.out.println("Hoowww");
    }

    public void SomeChoice(long a, long b) {
        System.out.println("France");
    }

    public void SomeChoice(IOException e) {
        System.out.println("IOException");

    }

    public String SomeChoice(StackTraceElement e) {
        System.out.println("StackTraceElement");
        return null;
    }

    public static void main(String[] args) {
        GoodPract goodPract = new GoodPract();
        // goodPract.SomeChoice(a, b);
        goodPract.SomeChoice(e);

    }
}

