package ru.job4j.manyarraynumgivennum;

public class Task59 {
    public static void loop(int num, int[] array) {
        int count = 0;
        int count2 = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] == num) {
                count++;
            } else if (array[i] < num) {
                count2++;
            }
        }
        System.out.println("Равно: " + count + ", меньше: " + count2);
    }
}
