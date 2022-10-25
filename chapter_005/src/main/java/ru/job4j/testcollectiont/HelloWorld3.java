package ru.job4j.testcollectiont;

public class HelloWorld3 {
    public static String checkNumber(int number) {

        if (number%3 == 0) {
            return "Hello";
        }

        else if  (number%5 == 0) {
            return "World";
        }

        else if (number%3 == 0 && number%5 == 0)  {
            return "Hello, World!!!";
        }

        else  {
            return "Operation not support";
        }
    }
}
