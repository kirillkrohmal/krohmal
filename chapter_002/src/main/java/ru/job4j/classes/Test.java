package ru.job4j.classes;


/**
 * Class Test.
 *
 * @author Krohmal Kirill (mailto:krohmal_kirill@mail.ru)
 * @since 08.07.2017
 */
public class Test {
    private static String k = " народ";

    /**
     * @return i возвращает результат
     * @since 08.07.2017
     * Конструктор field дл¤ класса Field возвращает результат
     */
    public Field field() {
        return new Field() {
            /** @since 08.07.2017
             * @param i задает значение.
             */
            private int i = 11;

            public int p() {
                return i;
            }
        };
    }

    /**
     * Class Field.
     *
     * @author Krohmal Kirill (mailto:krohmal_kirill@mail.ru)
     * @since 08.07.2017
     */
    public static class Field {

        /**
         * @return str возвращает результат
         * @since 08.07.2017
         * Метод printString дл¤ класса Field возвращает результат
         */
        static String printString(String str) {
            System.out.println(str);
            return str;
        }

        /**
         * @since 08.07.2017
         * Метод showString дл¤ класса Field возвращает результат
         */
        static void showString() {
            System.out.println(k);
        }

        /**
         * @param s задает значение.
         * @since 08.07.2017
         */
        private String s = "Привет";
    }
}

/**
 * Class Figure.
 *
 * @author Krohmal Kirill (mailto:krohmal_kirill@mail.ru)
 * @since 08.07.2017
 */
class Figure {
    /**
     * @param k задает значение.
     * @since 08.07.2017
     */
    final int k = 0;

    /**
     * @since 08.07.2017
     * Метод printString дл¤ класса Figure возвращает результат
     */
    public void printString(final int k) {
        class LocalClass {
            /**
             * @since 08.07.2017
             * Метод print дл¤ класса Figure печатает.
             */
            public void print() {
                System.out.println("Hurrae" + k);
            }
        }
        new LocalClass().print();
    }

    /**
     * @param k задает значение.
     * @since 08.07.2017
     */
    private String s = "Привет";
}

/**
 * Class TestClass.
 *
 * @author Krohmal Kirill (mailto:krohmal_kirill@mail.ru)
 * @since 08.07.2017
 */
class TestClass {
    public static void main(String[] args) {
        Test test = new Test();
        /** @since 08.07.2017
         * @param i задает значение.
         */
        int i = 8;

        new Figure().printString(12);
    }
}
