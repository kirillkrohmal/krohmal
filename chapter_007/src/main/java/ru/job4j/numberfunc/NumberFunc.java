package ru.job4j.numberfunc;

import java.util.ArrayList;
import java.util.stream.Stream;

public class NumberFunc {

    public static void stream() {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);

        Integer integer = arrayList.stream().max(Integer::compare).get();
        System.out.println(integer);
        Integer integer2 = arrayList.stream().min(Integer::compare).get();
        System.out.println(integer2);

    }

    public static void main(String[] args) {
        stream();
    }
}
