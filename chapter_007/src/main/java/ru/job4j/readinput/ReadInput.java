package ru.job4j.readinput;

import java.io.*;

public class ReadInput {

    public static void main(String[] args) throws IOException {
        ByteArrayInputStream inputStream = new ByteArrayInputStream(new byte[]{2,3,4,8});

        System.out.println(readInpStream(inputStream));

    }

    public static int readInpStream (InputStream inputStream) throws IOException {
        int n = 0;
        int temp = 0;

        while((temp = inputStream.read())!= -1 )  {
            if (temp > 127){
               temp -= 256;
            }
            n+= temp;
        }
        return n;
    }


}
