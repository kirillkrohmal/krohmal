package ru.job4j.ExtraTasks;

/**
 * Реализовать программу калькулятор. Калькулятор должен выполнять операции: сложение, вычитание, умножение, деление, возведение
 * в степень. При выполнении деления ввести проверку на 0.
 * Если второй аргумент 0 нужно выкинуть исключение java.lang.IllegalStateException
 */
public class Calc {
    double result;

    public double getResult() {
        return this.result;
    }

    public void plus (double x, double y) {
        this.result = x + y;
    }

    public void minus (double x, double y) {
        this.result = x - y;
    }

    public void multiple (double x, double y) {
        this.result = x * y;
    }

    public void exp (double x) {
        this.result = Math.exp(x);
    }

    public void divide (double x, double y) {
        if (y == 0) {
            throw new IllegalStateException("Введите число не равное 0");
        } else {
            this.result = x / y;
        }
    }
}
