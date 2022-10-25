package ru.job4j.utfstream;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UtfStream {

    public static void main(String[] args) {

        HashMap<String, Integer> integerHashMap = new HashMap<>();

        Scanner scanner = new Scanner(System.in, ("UTF-8")).useDelimiter("[^\\p{L}\\p{Digit}]+");

        scanner.forEachRemaining(i -> integerHashMap.merge(i.toLowerCase(), 1, (a, b) -> a + b));

        integerHashMap.entrySet().stream().sorted((el1, el2) -> {
            if (el1.getValue() == el2.getValue())
                return el1.getKey().compareTo(el2.getKey());
            return el2.getKey().compareTo((el1.getKey()));}).limit(10).map(Map.Entry::getKey).forEach(System.out::println);


        scanner.close();
        }
    }
