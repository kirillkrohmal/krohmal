package ru.job4j.Practice.Chapter2;

/**
 * Created by Comp on 19.10.2017.
 */
public class Chapter2 {
    public static void main(String[] args) {
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23};
        int sumOfPrimes = 0;
        for (int i = 0; i < primes.length; i++)
            sumOfPrimes = sumOfPrimes + primes[i];
        System.out.println(sumOfPrimes);
    }

    private static class Employee {
        public Employee(String[] s) {
        }
    }
}
