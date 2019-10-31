package ru.job4j.TrackerSQL.inputs;

public interface Input {
     String ask(String question);
     int ask(String question, int[] range);
}
