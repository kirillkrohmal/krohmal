package ru.job4j.inpreader;

import org.w3c.dom.ls.LSOutput;

import java.io.*;

public class InpStream {

    public static void print(InputStream inputStream, OutputStream outputStream) throws IOException {
        int buff;

        while ((buff = inputStream.read()) != -1) {
            if (buff%2==0) {
                outputStream.write(buff);
            }

        }

        outputStream.flush();
        inputStream.close();
        outputStream.close();
        System.out.println(outputStream);
    }

    public static void main(String[] args) throws IOException {

        ByteArrayInputStream inputStream = new ByteArrayInputStream(new byte[]{1,4,5,6});
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        print(inputStream, outputStream);
    }
}
