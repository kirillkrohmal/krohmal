package ru.job4j.swapfirstlastdigitsfourdignum;

public class Task36 {
    public static void firstLastChange(int number) {
        int first;
        int middle;
        int last;

        first = number / 1000  ;
        middle = (number / 10) % 100; ;
        last = number % 10;

        if (first == 0 && middle == 0) {
            System.out.println(last);
        } else if (first == 0 ) {
            System.out.println(first+ last);
        } else System.out.println(first + middle * 10 + last * 1000);
    }

}

