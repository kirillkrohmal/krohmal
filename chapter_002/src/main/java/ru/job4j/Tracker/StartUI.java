package ru.job4j.Tracker;

import java.util.Scanner;

/**
 * Created by Comp on 12.06.2017.
 */
public class StartUI {
    private static int num;
    private Input input;
    private Tracker tracker;

    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }
   /*
    test1
    1
    test1
    this test Tracker1
    16/06/2017*/
    public void init() {
        String[] init = new String[]{
                this.input.ask("0. Add new Item"),
                this.input.ask("1. Show all items"),
                this.input.ask("2. Edit item"),
                this.input.ask("3. Delete item"),
                this.input.ask("4. Find item by Id"),
                this.input.ask("5. Find items by name"),
                this.input.ask("6. Exit Program"),

        };
        System.out.println("Select: ");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();



        switch (num) {
            case 0:
                System.out.println("Введите имя пользователя и описание заявки: ");
                String key = scanner.nextLine();
                String id = scanner.nextLine();
                String name = scanner.nextLine();
                String comments = scanner.nextLine();
                Long creat = System.currentTimeMillis();
                Item item = new Item(key, id, name, comments, creat);
                tracker.add(item);
                break;
            case 1:
                System.out.println("Показать все заявки: ");
                String b = scanner.nextLine();
            case 2:
                System.out.println("Введите id пользователя: ");
                String c = scanner.nextLine();
            case 3:
                System.out.println("Введите id пользователя: ");
                String d = scanner.nextLine();
            case 4:
                System.out.println("Введите id пользователя: ");
                String e = scanner.nextLine();
            case 5:
                System.out.println("Введите имя пользователя: ");
                String g = scanner.nextLine();
            case 6:
                System.out.println("Выйти из программы: ");
                String k = scanner.nextLine();

                if (k.equals("y")) {

                }
        }
    }

    public static void main(String[] args) {
        Input inputCons = new ConsoleInput();
        //inputCons.ask(tracker.add())
        new StartUI(inputCons).init();
    }
}
