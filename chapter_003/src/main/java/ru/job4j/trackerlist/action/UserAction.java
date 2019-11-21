package ru.job4j.trackerlist.action;

import ru.job4j.trackerlist.Tracker;
import ru.job4j.trackerlist.inputs.Input;

/**
 * Created by Comp on 22.06.2017.
 */
public interface UserAction {

    int key();

    String info();

    void execute(Input input, Tracker tracker);
}
