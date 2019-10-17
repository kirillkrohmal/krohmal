package ru.job4j.FileReader;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) {

        try {
            Scanner reader = new Scanner(new File("/projects/krohmal/chapter_008/src/main/resources/app.properties"));
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}








