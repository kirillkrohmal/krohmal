package ru.job4j.extratasks.task007;

/**
 * Реализовать класс Expression. Класс должен принимать
 * строку из просто математического выражения и методы double calc().
 * Должен поддерживать операции + - / * exp. Например, "2+2" - 4, "2-2" - 0
 * Если выражение не корректное выбросить исключение java.lang.IllegalStateException
 */
public class Expression {
    double result;

    public double getResult() {
        return this.result;
    }

    public void plus(double x, double y) {
        this.result = x + y;
    }

    public void minus(double x, double y) {
        this.result = x - y;
    }

    public void multiple(double x, double y) {
        this.result = x * y;
    }

    public void exp(double x) {
        this.result = Math.exp(x);
    }

    public void divide(double x, double y) {
        if (y == 0) {
            throw new IllegalStateException("Введите число не равное 0");
        } else {
            this.result = x / y;
        }
    }
}


