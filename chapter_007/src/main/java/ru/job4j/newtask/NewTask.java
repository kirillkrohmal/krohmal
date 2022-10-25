package ru.job4j.newtask;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class NewTask {

    public static void method() {
        File file = new File("C://file/1.txt");

        String[] array = {"new ", "old", "cupboard", "read", "write"};

        try(FileWriter fileWriter = new FileWriter(file)) {
            for (int i = 0; i < array.length; i++) {
                fileWriter.write(array[i]);
            }
        } catch(IOException e) {
                System.out.println("Произошла ошибка");
        }
    }

    public static void main(String[] args) {
        method();
    }
}
