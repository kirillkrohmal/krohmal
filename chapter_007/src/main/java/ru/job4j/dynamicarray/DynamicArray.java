package ru.job4j.dynamicarray;

import java.util.ArrayList;
import java.util.Arrays;

public class DynamicArray<T> {
    private T[] ts = (T[]) new Object[1];
    private int size;


    public DynamicArray() {
    }

    void add(T el) {
        el = (T) Arrays.copyOf(ts, ++size);
        ts[size - 1] = el;
    }

    void remove(int index) {
        size--;
        System.arraycopy(ts, index + 1, ts, index, size - index);
    }

    T get(int index) {
        return ts[index];
    }

    public static void main(String[] args) {
        DynamicArray<Integer> dynamicArray = new DynamicArray();

        dynamicArray.add(6);
        int t = (dynamicArray.get(0)).intValue();
        System.out.println(t);
    }

    @Override
    public String toString() {
        return "DynamicArray{" +
                "ts=" + Arrays.toString(ts) +
                ", size=" + size +
                '}';
    }
}
