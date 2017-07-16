package ru.job4j.TrackerList.inputs;

import java.util.ArrayList;

/**
 * Created by Comp on 12.06.2017.
 */
public interface Input {
    String ask(String question);
    int ask(String question, ArrayList<int[]> range);
}
