package ru.job4j.numbergenerator;


@FunctionalInterface
public interface NumberGenerator<T extends Number> {
    boolean cond(T arg);


}
