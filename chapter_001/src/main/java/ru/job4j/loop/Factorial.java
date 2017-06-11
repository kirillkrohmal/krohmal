package ru.job4j.loop;

/**
 * Class Factorial.
 *
 * @author Krohmal Kirill (mailto:krohmal_kirill@mail.ru)
 * @since 24.05.2017
 */
public class Factorial {
    /**
     * @param n первый аргумент.
     * @return result
     * @since 24.05.2017
     * Метод calc дл¤ класса Factorial вычисляет площадь треугольника на графике и выявляет условие невозможности
     */
    public int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

	
	