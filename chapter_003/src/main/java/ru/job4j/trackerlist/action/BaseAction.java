package ru.job4j.trackerlist.action;

import ru.job4j.trackerlist.Tracker;
import ru.job4j.trackerlist.inputs.Input;

/**
 * Created by Comp on 01.07.2017.
 */
public abstract class BaseAction implements UserAction {
    public BaseAction(Input input, Tracker tracker) {

    }

    public abstract int key();

    public abstract String name();

    public BaseAction() {
        this.key();
        this.name();
    }

    @Override
    public String info() {
        return String.format("%s. %s", this.key(), this.name());
    }
}
