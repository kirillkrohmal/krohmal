package ru.job4j.Classes;


/**
 * Created by Comp on 08.07.2017.
 */
public class Test {
    private static String k = " народ";

    //анонимный класс
    public Field fied() {
        return new Field() {
            private int i = 11;

            public int p() {
                return i;
            }
        };
    }

    //вложенный класс
    public static class Field {

        static String printString(String str) {
            System.out.println(str);
            return str;
        }

        static void showString() {
            System.out.println(k);
        }

        private String s = "Привет";
    }
}
//Локальный класс
class Figure {
    final int k = 0;

    public void printString(final int k) {
        class LocalClass {
            public void print() {
                System.out.println("Hurrae" + k);
            }
        }
        new LocalClass().print();
    }

    private String s = "Привет";
}

class TestClass {
    public static void main(String[] args) {
        Test test = new Test();
        int i = 8;

        new Figure().printString(12);
    }
}
