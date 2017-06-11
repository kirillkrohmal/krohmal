package ru.job4j.max;

/**
 * Class Max.
 *
 * @author Krohmal Kirill (mailto:krohmal_kirill@mail.ru)
 * @since 23.05.2017
 */
public class Max {
    /**
     * @param first  первый аргумент.
     * @param second второй аргумент.
     * @param third  третий аргумент.
     * @return max
     * @since 23.05.2017
     * Метод max для класса Max
     */
    public int max(int first, int second, int third) {
        return this.max(first, this.max(third, second));

    }

    /**
     * @param first  первый аргумент.
     * @param second третий аргумент.
     * @return result
     * @since 23.05.2017
     * Метод max для класса Max
     */
    public int max(int first, int second) {
        return first > second ? first : second;
    }
}