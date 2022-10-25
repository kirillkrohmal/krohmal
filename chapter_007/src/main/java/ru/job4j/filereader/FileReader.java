package ru.job4j.filereader;

import java.io.*;
import java.util.Scanner;

public class FileReader {

    public static void method(File a, File b) throws IOException {
        FileInputStream in = new FileInputStream(a);
        FileOutputStream out = new FileOutputStream(b);

        int n;

        while ((n = in.read()) != -1) {
            out.write(n);
        }

        in.close();
        out.close();
    }

    public static void main(String[] args) throws IOException {
        File fa = new File("c://file/1.txt");
        fa.getAbsolutePath();

        File fb = new File("c://file/2.txt");
        fb.getAbsolutePath();

        method(fa, fb);
    }
}
