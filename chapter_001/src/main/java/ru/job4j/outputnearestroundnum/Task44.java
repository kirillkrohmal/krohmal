package ru.job4j.outputnearestroundnum;

public class Task44 {
    public static void getRoundNumber(int number) {

       boolean num = number % 10 == 0;

       if (num) {
           System.out.println(number);
       }
       if (number % 10 > 0 && number % 10 < 5) {
           System.out.println(number - (number % 10));
       }

       if (number % 10 >= 5) {
           System.out.println(number + (10 - number % 10));
       }
    }
}
