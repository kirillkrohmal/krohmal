package ru.job4j.Tracker.action;

import ru.job4j.Tracker.Tracker;
import ru.job4j.Tracker.inputs.Input;

/**
 * Created by Comp on 22.06.2017.
 */
public interface UserAction {

    int key();
    String info();

    void execute(Input input, Tracker tracker);
}
