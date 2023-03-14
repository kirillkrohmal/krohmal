package ru.job4j.determineratioofthreenum;

public class Task60 {
    public static void numRelation(int a, int b, int c) {
        int num = a + b;
        if (a == b && b == c) {
            System.out.println("Все равны");
        } else if (a != b && b != c) {
            System.out.println("Равных нет");
        } else if (a == b && b == c && num < c) {
            System.out.println("Первое и третье равны, второе больше");
        } else if (a == b && b == c && num > c) {
            System.out.println("Первое и третье равны, второе меньше");
        }
    }
}
