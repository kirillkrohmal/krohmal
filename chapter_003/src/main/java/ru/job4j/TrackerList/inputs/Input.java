package ru.job4j.TrackerList.inputs;

import java.util.ArrayList;

/**
 * Created by Comp on 12.06.2017.
 */
public interface Input {
    int ask(String question, ArrayList<int[]> range);

    String ask(String question);
}
