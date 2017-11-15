package ru.job4j.Practice.Example_1;

/**
 * Created by Comp on 17.11.2017.
 */
public class test {
    public static void main(String[] args) {
        String key = "key";
        String text = "text";
        int alg = 1;

        Encryption encryption = new Encryption(text, key);
        String cryptedText = encryption.DEScrypt(text, key);
        System.out.println(cryptedText);
    }
}

