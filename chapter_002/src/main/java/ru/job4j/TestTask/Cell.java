package ru.job4j.TestTask;

/**
 * Created by Comp on 03.07.2017.
 */
public class Cell {
    public String paint(int higth) {

        StringBuilder builder = new StringBuilder();
        String line = System.getProperty("line.separator");

        int width = 2 - higth/2;


        for (int i = 0; i <= higth; i++) {
            for (int j = 0; j <= width; j++) {

            }
        }
        return builder.toString();
    }
}
