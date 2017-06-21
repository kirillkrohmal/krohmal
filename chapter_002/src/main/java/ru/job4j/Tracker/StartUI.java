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

    /*public void printAll() {
        Item[] inputs = tracker.findAll();
        for (int i = 0; i < ; i++) {

        }
    }*/
   /*
    test1
    1
    test1
    this test Tracker1
    16/06/2017*/
    public void init() {
        String[] init = new String[]{
                this.input.ask("0. Add new Item;"),
                this.input.ask("1. Show all items;"),
                this.input.ask("2. Edit item;"),
                this.input.ask("3. Delete item;"),
                this.input.ask("4. Find item by Id;"),
                this.input.ask("5. Find items by name;"),
                this.input.ask("6. Exit Program."),
        };
        System.out.println("Select: ");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        switch (num) {
            case 0:
                System.out.println("Введите имя пользователя и описание заявки: ");
                String id = scanner.nextLine();
                String key = scanner.nextLine();
                String name = scanner.nextLine();
                String comments = scanner.nextLine();
                Long creat = System.currentTimeMillis();
                Item item = new Item(key, id, name, comments, creat);
                tracker.add(item);
                break;
            case 1:
                System.out.println("Показать все заявки: ");
                tracker.findAll();
                break;
            case 2:
                System.out.println("Введите id пользователя: ");
                //tracker.update();
                String c = scanner.nextLine();
            case 3:
                System.out.println("Введите id пользователя: ");
                String id1 = scanner.nextLine();
                tracker.delete(id1);
                //String d = scanner.nextLine();
            case 4:
                System.out.println("Введите id пользователя: ");
                String id2 = scanner.nextLine();
                tracker.findById(id2);
                //String e = scanner.nextLine();
            case 5:
                System.out.println("Введите имя пользователя: ");
                String name1 = scanner.nextLine();
                tracker.findByName(name1);
                //String g = scanner.nextLine();
            case 6:
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Выйти из программы: ");
                if (scanner1.equals("y")) {
                    break;
                }
                else {
                    return;
                }
        }
    }

    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Input inputCons = new ConsoleInput();
        //inputCons.ask(tracker.add())
        new StartUI(inputCons, tracker).init();

        /*for (Input input : inputCons.ask()) {
            System.out.println();
        }*/
    }
}
