package ru.job4j.arraytask2;


/**
 * Class ArrayTask2.
 *
 * @author Krohmal Kirill (mailto:krohmal_kirill@mail.ru)
 * @since 17.11.2019
 */
public class ArrayTask2 {
    /**
     * @return result возвращает результат
     * @since 17.11.2019
     * Метод contains дл¤ класса ArrayTask2 сравнивает два массива строк
     * сопоставляет их и определяет есть ли в этом массиве это строка
     */
    public boolean contains(String[] sub, String[] origin) {
        /** @since 17.11.2019
         * @param result имеет отрицательное boolean значение.
         */
        boolean result = false;

        for (int i = 0; i < origin.length; i++) {
            for (int j = 0; j < sub.length; j++) {
                if (origin[i].equals(sub[i + j])) {
                    result = true;
                }
                if (!origin[i].equals(sub[i + j])) {
                    result = false;
                    break;
                }
                if (result) {
                    break;
                }
            }
        }
        return result;
    }
}

