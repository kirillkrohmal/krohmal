package ru.job4j.TestTask.action;

import ru.job4j.TestTask.Operation;
import ru.job4j.TestTask.input.Input;

/**
 * Created by Comp on 25.08.2017.
 */
public abstract class BaseAction implements UserAction {

    public abstract int key();
    public abstract String name();

    public BaseAction(Input input, Operation operation) {
        this.key();
        this.name();
    }

    @Override
    public String info() {
        return String.format("%s, %s", this.key(), this.info());
    }
}
