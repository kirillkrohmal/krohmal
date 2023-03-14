package ru.job4j.amountpointscover;

public class Task18 {
    public static int capSum(int tens, int hundreds, int thousands) {
        int sum = (thousands * 1000) + (hundreds * 100) + (tens * 10);
        return sum;
    }

    public static void main(String[] args) {
        capSum(1, 2, 3);
    }
}
