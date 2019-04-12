package Tracker.actions;

import Tracker.Tracker;
import ru.job4j.Tracker.Input;

/**
 * Created by Comp on 12.04.2019.
 */
public class BasedAction implements UserAction {
    @Override
    public int key() {
        return 0;
    }

    @Override
    public String info() {
        return null;
    }

    @Override
    public void execute(Input input, Tracker tracker) {

    }
}
