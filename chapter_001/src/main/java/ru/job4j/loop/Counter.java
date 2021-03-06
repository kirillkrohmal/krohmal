package ru.job4j.loop;

/**
 * Class Counter возвращет сумму четных чисел от 1 до 10.
 *
 * @author Krohmal Kirill (mailto:krohmal_kirill@mail.ru)
 * @since 23.05.2017
 */
public class Counter {
    /**
     * @param start  первый аргумент.
     * @param finish второй аргумент.
     * @return result
     * @since 23.05.2017
     * Метод add дл¤ класса Counter вычисляет площадь треугольника на графике и выявляет условие невозможности
     */
    public int add(int start, int finish) {
        int result = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                result += i;
            }
        }
        return result;
    }
}