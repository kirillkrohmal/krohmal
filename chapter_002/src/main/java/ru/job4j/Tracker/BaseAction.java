package ru.job4j.Tracker;

/**
 * Created by Comp on 01.07.2017.
 */
public abstract class BaseAction implements UserAction {

    public abstract int key();
    public abstract String name();

    @Override
    public String info() {
        return String.format("%s. %s", this.key(), this.name());
    }

    public void BaseAction() {
        this.key();
        this.name();
    }
}
