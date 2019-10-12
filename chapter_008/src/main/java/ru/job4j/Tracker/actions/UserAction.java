package Tracker.actions;

import Tracker.TrackerSQL;
import Tracker.input.Input;


/**
 * Created by Comp on 12.04.2019.
 */
public interface UserAction {
    int key();

    String info();

    void execute (Input input, TrackerSQL tracker);

}
