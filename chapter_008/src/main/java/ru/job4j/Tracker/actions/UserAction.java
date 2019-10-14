package ru.job4j.Tracker.actions;

import ru.job4j.Tracker.TrackerSQL;
import ru.job4j.Tracker.input.Input;


/**
 * Created by Comp on 12.04.2019.
 */
public interface UserAction {
    int key();

    String info();

    void execute (Input input, TrackerSQL tracker);

}
