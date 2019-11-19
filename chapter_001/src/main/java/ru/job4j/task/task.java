package ru.job4j.task;

/**
 * Class Task.
 *
 * @author Krohmal Kirill (mailto:krohmal_kirill@mail.ru)
 * @since 17.11.2019
 */
public class Task {
    /**
     * @return result возвращает результат
     * @since 17.11.2019
     * Метод contains дл¤ класса Task сравнивает буквы двух массивов
     * сопоставляет их и находит одинаковые
     */
    public boolean contains(String sub, String origin) {
        /** @since 17.11.2019
         * @param result имеет отрицательное oolean значение.
         */
        boolean result = false;
        /** @since 17.11.2019
         * @param subString первый символьный массив.
         */
        char[] subString = sub.toCharArray();
        /** @since 17.11.2019
         * @param originString второй символьный массив.
         */
        char[] originString = origin.toCharArray();

        for (int i = 0; i < originString.length; i++) {
            for (int j = 0; j < subString.length; j++) {
                if (originString[i] == subString[i + j]) {
                    result = true;
                    break;
                }
                if (originString[i] != subString[i + j]) {
                    result = false;
                    break;
                }
            }
            if (result) {
                break;
            }
        }
        return result;
    }
}
