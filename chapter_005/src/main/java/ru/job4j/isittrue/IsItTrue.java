package ru.job4j.isittrue;

public class IsItTrue {

    public boolean isit(double a, double b, double c)  {
        return Math.abs(a + b - c) <= 0.0001;
    }

    public static void main(String[] args) {
        IsItTrue isItTrue = new IsItTrue();
        System.out.println(isItTrue.isit(4, 3, 6));
    }
}
