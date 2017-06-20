package ru.job4j.Tracker;

/**
 * Created by Comp on 12.06.2017.
 */
public class StartUI {
    private Input input;

    public StartUI(Input input) {
        this.input = input;
    }

    public void init() {
        ConsoleInput consoleInput = new ConsoleInput();
        String add = consoleInput.ask("0. Add new Item");
        String show = consoleInput.ask("1. Show all items");
        String edit = consoleInput.ask("2. Edit item");
        String delete = consoleInput.ask("3. Delete item");
        String findId = consoleInput.ask("4. Find item by Id");
        String findName = consoleInput.ask("5. Find items by name");
        String exit = consoleInput.ask("6. Exit Program");


        StubInput stubInput = new StubInput(new Item[]{});
        Tracker tracker = new Tracker();
        //tracker.add(new Task(name, "Name"));

    }

    public static void main(String[] args) {
       Input inputStub = new StubInput(new String[]{"Create Stub task "});
       Input inputCons = new ConsoleInput();
       Tracker tracker = new Tracker();
       //inputCons.ask(tracker.add())
       new StartUI(inputCons).init();
       new StartUI(inputStub).init();
       new StartUI(new StubInput(new String[]{"Create Stub task "})).init();
    }
}
