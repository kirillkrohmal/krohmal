package ru.job4j.palindrom;

public class Palindrom {
    public static String palindrom(String one) {

       String text =  one.replaceAll("[^a-zA-Z0-9]", " ");
       String someText = new StringBuffer(text).reverse().toString();
       return someText;
    }

    public static void main(String[] args) {
        System.out.println(palindrom("It was a baby"));
    }
}
