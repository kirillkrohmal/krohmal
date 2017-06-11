package ru.job4j.calculator;

/**
 * Class Calculate.
 *
 * @author Krohmal Kirill (mailto:krohmal_kirill@mail.ru)
 * @since 20.05.2017
 */

public class Calculator {
    /**
     * @param result возвращает результат в переменную.
     * @since 20.05.2017
     * Переменная result
     */
    private double result;

    /**
     * @return result возвращает результат в переменную.
     * @since 20.05.2017
     * Метод getResult для класса Calculator
     */
    public double getResult() {
        return this.result;
    }

    /**
     * @param first  первый аргумент.
     * @param second второй аргумент.
     * @since 20.05.2017
     * Метод add сложение для класса Calculator
     */
    void add(double first, double second) {
        this.result = first + second;
    }

    /**
     * @param first  первый аргумент.
     * @param second второй аргумент.
     * @since 20.05.2017
     * Метод substruct вычитание для класса Calculator
     */
    void substruct(double first, double second) {
        this.result = first - second;
    }

    /**
     * @param first  первый аргумент.
     * @param second второй аргумент.
     * @since 20.05.2017
     * Метод div деление для класса Calculator
     */
    void div(double first, double second) {
        this.result = first / second;
    }

    /**
     * @param first  первый аргумент.
     * @param second второй аргумент.
     * @since 20.05.2017
     * Метод multiple умножение для класса Calculator
     */
    void multiple(double first, double second) {
        this.result = first * second;
    }
}

