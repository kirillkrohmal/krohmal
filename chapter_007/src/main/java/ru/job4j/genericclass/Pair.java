package ru.job4j.genericclass;

import ru.job4j.generictype.Box;

import java.util.Objects;

public class Pair<T, V> {

    private T first;
    private V second;



    private Pair(T t, V v) {
        first = t;
        second = v;
    }

    public T getFirst() {
        return first;

    }

    public V getSecond() {
        return second;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (Pair.class.isInstance(o)) {
            return Objects.equals(first, ((Pair<?, ?>)o).first) && Objects.equals(second, ((Pair<?,?>)o).second);
        }

        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.getFirst())^Objects.hashCode(this.getSecond());
    }

    static <T, V> Pair <T, V> of(T t, V v) {
        return new Pair(t, v);
    }

    public static void main(String[] args) {
        Pair<String, Double> pair = Pair.of("hello", 1.5);
        String i = pair.getFirst(); // 1
        Double s = pair.getSecond(); // "hello"
        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2); // true!
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!
        System.out.println(mustBeTrue);
        System.out.println(mustAlsoBeTrue);
    }
}
