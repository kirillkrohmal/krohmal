package ru.job4j.extratasks.task008;

import java.util.Scanner;

/**
 * Реализовать класс вычисляющий простые числа до N.
 */
public class ComputN {
    Scanner scanner = new Scanner(System.in);
    long result = 0;

    public long getResult() {
        return result;
    }

    public void setResult(long result) {
        this.result = result;
    }

    public void compute() {
        //String number = "";
        System.out.println("Введите значение: ");
        long number1 = scanner.nextLong();
        System.out.println("Введите значение: ");
        long number2 = scanner.nextLong();
        System.out.println("Введите значение: ");
        String number3 = String.valueOf(scanner.nextLong());
        if (number3 == "+") {
            this.result = number1 + number2;
        } else if (scanner.equals("-")) {
            this.result = number1 - number2;
        } else if (scanner.equals("*")) {
            this.result = number1 * number2;
        } else if (scanner.equals("/")) {
            this.result = number1 / number2;
        } else if (scanner.equals("квадрат")) {
            this.result = (long) Math.pow(number1, number2);
        }
    }

    public static void main(String[] args) {
        ComputN computN = new ComputN();
        computN.compute();
    }
}
