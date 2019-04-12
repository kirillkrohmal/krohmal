package Tracker;

import Tracker.input.Input;
import Tracker.input.StubInput;

/**
 * Created by Comp on 12.06.2017.
 */
public class StartUI {
    private Input input;
    private int position = 1;
    private Tracker tracker;
    private static int num;


    public StartUI(Input input, Tracker tracker) {
    }

    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{});
        new StartUI(input, tracker).init();
    }

    int[] range = {
            position++, position++, position++, position++, position++, position++, position++, position++
    };

    public void init() {
        Tracker tracker = new Tracker();
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
