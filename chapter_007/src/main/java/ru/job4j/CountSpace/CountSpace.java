package ru.job4j.CountSpace;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.CharBuffer;

/**
 * Created by Comp on 06.10.2017.
 */
public class CountSpace implements Runnable{
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String text) {
        System.out.println(text);
    }

    private String text = null;

    public CountSpace(String text) {
        this.text = text;
    }

    public String words () {

        return null;
    }

    public static void main(String[] args) {
        new Thread(new CountSpace("Создали новый объект класса Thread, передали ему в конструкторе объект printer, чей метод run() нужно будет исполнить.")).start();
    }

    @Override
    public void run() {
        try {
            while(bufferedReader.read() > text.length()) {
                bufferedReader.read(CharBuffer.wrap(text));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sentence(String s) {

    }

    public void sentence2(String s2) {

    }


}

