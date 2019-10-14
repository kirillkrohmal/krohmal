package ru.job4j.Tracker;

import ru.job4j.Tracker.input.Input;
import ru.job4j.Tracker.input.StubInput;

/**
 * Created by Comp on 12.06.2017.
 */
public class StartUI {
    private Input input;
    private int position = 1;
    private TrackerSQL tracker;
    private static int num;


    public StartUI(Input input, TrackerSQL tracker) {
    }

    public static void main(String[] args) {
        TrackerSQL tracker = new TrackerSQL();
        Input input = new StubInput(new String[]{});
        new StartUI(input, tracker).init();
    }

    int[] range = {
            position++, position++, position++, position++, position++, position++, position++, position++
    };

    public void init() {
        TrackerSQL tracker = new TrackerSQL();
        MenuTracker menuTracker = new MenuTracker(this.input, tracker);
        menuTracker.fillAction();
        do {
            //menuTracker.addAction();
            menuTracker.show();
            //int key = Integer.parseInt(input.ask("Select: "));
            menuTracker.select(input.ask("Select: ", range));

        }
        while (!"y".equals(this.input.ask("Exit? y")));

    }
}
