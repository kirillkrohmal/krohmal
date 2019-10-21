package ru.job4j.FileReader;

import ru.job4j.Tracker.TrackerSQL;


import java.io.InputStream;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) {

        try {
            InputStream in = FileReader.class.getClassLoader().getResourceAsStream("app.properties");
            Scanner reader = new Scanner(in);

            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}








