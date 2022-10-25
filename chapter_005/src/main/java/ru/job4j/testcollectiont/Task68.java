package ru.job4j.testcollectiont;

public class Task68 {
    public static void array(int[] arr) {
        String sb = new String();
        for (int i = 0; i < arr.length; i++) {


            sb+=(arr[i] + " ");

        }
        sb.substring(sb.length() - 1);
        System.out.println(sb);
    }

    public static void main(String[] args) {
        String s = "123";

        int[] arr = {5, -2, 6, 0};
        System.out.println(s);
        array(arr);
    }
}
