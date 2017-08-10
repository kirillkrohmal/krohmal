package ru.job4j.CollectionSort;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Comp on 09.08.2017.
 */
public class ListTime {
    public static void main(String[] args) {
        System.out.println(getTimeMsOfGet(fill(new ArrayList())));
        System.out.println(getTimeMsOfGet(fill(new LinkedList())));
    }

    private static List fill(List list) {
        for (int i = 0; i < 11; i++) {
            list.add(new Object());
        }
        return list;
    }

    public static long getTimeMsOfGet(List list) {
        //напишите тут ваш код
        Date currentDate = new Date();
        get10000(list);
        Date newDate = new Date();
        long msDelay = newDate.getTime() - currentDate.getTime();
        System.out.println("Time delay is: " + msDelay + " in ms");
        return msDelay;

        //напишите тут ваш код

    }

    public static void get10000(List list) {
        if (list.isEmpty()) return;
        int x = list.size() / 2;

        for (int i = 0; i < 10000; i++) {
            list.get(x);
        }
    }
}