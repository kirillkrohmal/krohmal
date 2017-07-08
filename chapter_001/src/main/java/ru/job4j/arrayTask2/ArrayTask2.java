package ru.job4j.arrayTask2;

/**
 * есть массив строк. и есть другая строка. надо написать метод,
 * которые определяет есть ли в этом массиве это строка.
 */

public class ArrayTask2 {
    public boolean contains(String[] sub, String[] origin) {
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
                if (result)
                    break;
            }
        }
        return result;
    }
}

