package ru.job4j.massiv;

public class Massiv {
    public static void printOddNumbers(int[] one) {
        StringBuilder builder = new StringBuilder();

        for (int i : one) {
            if (i % 2 != 0) {
                builder.append(i);
                builder.append(",");

            }
        }
        if (isEmpty2(builder)) {
            builder.append("empty");
        } else {
            builder.deleteCharAt(builder.lastIndexOf(","));
        }

        System.out.println(builder);
    }

        public static boolean isEmpty2(StringBuilder str) {

            String s = str.toString();
            return s.trim().isEmpty();
        }

    public static void main(String[] args) {
        int[] array = {3, 6, 8, 7, 3, 5};
        printOddNumbers(array);

    }
}