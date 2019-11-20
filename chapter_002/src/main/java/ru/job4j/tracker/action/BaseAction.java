package ru.job4j.tracker.action;

/**
 * Created by Comp on 01.07.2017.
 */
public abstract class BaseAction implements UserAction {
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
