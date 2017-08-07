package ru.job4j.CollectionSort;

import java.util.*;

/**
 * Написать программу, которая замеряет время вставки в коллекцию большого количества случайных
 * строк и удаления в коллекции первых n элементов для:
 * В классе должно быть 2 метода:
 * public long add(Collection<String> collection, int amount) {}
 * public long delete(Collection<String> collection, int amount) {}
 * <p>
 * По результатам тестов расставьте коллекции по местам и объясните результат.
 * <p>
 * В комментарии к задаче надо указать
 * 1. Какое время заняла каждая операция
 * 2. Объяснить почему время отличается.
 */

public class CollectionSort {
    public long add(Collection<String> collection, int amount) {
        long t = System.currentTimeMillis();
        System.out.println("Начальное время " + t);

        for (int i = 0; i < amount; i++) {
            collection.add(String.valueOf(i));
        }
        long t2 = System.currentTimeMillis();
        System.out.println("Время после добавления элементов " + t2);

        long e = t2 - t;
        System.out.println("Конечное время " + e);

        return e;
    }

    public long delete(Collection<String> collection, int amount) {
        long t = System.currentTimeMillis();
        System.out.println("Начальное время " + t);

        for (int i = 0; i < amount; i++) {
            collection.remove(String.valueOf(i));
        }
        long t2 = System.currentTimeMillis();
        System.out.println("Время после добавления элементов " + t2);

        long e = t2 - t;
        System.out.println("Конечное время " + e);

        return e;
    }
}
