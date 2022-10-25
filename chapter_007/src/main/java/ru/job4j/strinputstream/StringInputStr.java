package ru.job4j.strinputstream;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class StringInputStr {
    public static String str(InputStream inputStream, Charset charset) throws IOException {
        StringBuilder builder = new StringBuilder();
        InputStreamReader ios = new InputStreamReader(inputStream, charset);

        int s;

        while ((s = ios.read()) != -1)  {
            builder.append((char) s);

        }
        return builder.toString();
    }

    public static void main(String[] args) throws IOException {
        ByteArrayInputStream inputStream = new ByteArrayInputStream(new byte[]{1,5,7,8});
        String s = str(inputStream, Charset.forName("UTF-8"));
        System.out.println(s);
    }
}
