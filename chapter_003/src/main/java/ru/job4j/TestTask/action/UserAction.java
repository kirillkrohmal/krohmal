package ru.job4j.TestTask.action;

import ru.job4j.TestTask.Operation;
import ru.job4j.TestTask.input.Input;

/**
 * Created by Comp on 25.08.2017.
 */
public interface UserAction {
    String info();

    int key();

    void execute(Input input, Operation operation);

}
