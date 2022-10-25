package ru.job4j.factorial;

import java.math.BigInteger;

public class Factorial {
    public static BigInteger somefactorial(int fact) {
        BigInteger integer = BigInteger.ONE;

        for (int i = 1; i < fact; i++) {
            integer = integer.multiply(BigInteger.valueOf(i));
        }


        return integer;
    }
}
