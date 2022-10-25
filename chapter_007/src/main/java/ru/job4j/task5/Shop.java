package ru.job4j.task5;


import java.io.CharArrayReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Shop {

   static Map<String, Long> getSalesMap() {
        Map<String, Long> stringLongMap = new HashMap<>();
        Scanner scaner = new Scanner(System.in);

        int i = 0;

        while(i < 5) {
            stringLongMap.merge(scaner.next(), scaner.nextLong(), (x, y) -> x + y);
            i++;


        }

        return stringLongMap;

    }

    public static void main(String[] args) {
        System.out.println(getSalesMap().toString());
    }
}
