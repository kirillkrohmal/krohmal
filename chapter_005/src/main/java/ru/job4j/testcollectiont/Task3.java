package ru.job4j.testcollectiont;

public class Task3 {
    public static boolean isPowerOfTwo (String h2) {
        h2 = h2.replaceAll("\\W","");
        StringBuilder builder = new StringBuilder();

        builder.reverse();

        String h1 = builder.toString();
        return h2.equalsIgnoreCase(h1);
    }

    public static void main(String args[]) {
        Task3 task3 = new Task3();
        System.out.println(task3.isPowerOfTwo("Was it a cat I saw"));
    }
}
