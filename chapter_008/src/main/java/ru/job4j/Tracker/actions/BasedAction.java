package Tracker.actions;

import Tracker.TrackerSQL;
import Tracker.input.Input;

/**
 * Created by Comp on 12.04.2019.
 */
public abstract class BasedAction implements UserAction {
    public BasedAction(Input input, TrackerSQL tracker) {
    }

    public abstract int key();
    public abstract String name();

    public void BasedAction() {
        this.key();
        this.name();
    }

    @Override
    public void execute(Input input, TrackerSQL tracker) {

    }

    @Override
    public String info() {
        return null;
    }
}
