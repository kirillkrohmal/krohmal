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

    public int init() {
        System.out.println("0. Add new Item;");
        System.out.println("1. Show all items;");
        System.out.println("2. Edit item;");
        System.out.println("3. Delete item;");
        System.out.println("4. Find item by Id;");
        System.out.println("5. Find items by name;");
        System.out.println("6. Exit Program.");

        num = Integer.valueOf(this.input.ask("Select: "));

        switch (num) {
            case 0:
                System.out.println("Введите имя");
                Scanner scanner = new Scanner(System.in);
                String id = scanner.nextLine();
                String key = scanner.nextLine();
                String name = scanner.nextLine();
                String comments = scanner.nextLine();
                Long creat = System.currentTimeMillis();
                Item item = new Item(key, id, name, comments, creat);
                tracker.add(item);
                break;
            case 1:
                tracker.findAll();
                break;
            case 2:
                System.out.println("Введите id пользователя: ");
                Scanner scanner1 = new Scanner(System.in);
                String id1 = scanner1.nextLine();
                String key1 = scanner1.nextLine();
                String name1 = scanner1.nextLine();
                String comments1 = scanner1.nextLine();
                Long creat1 = System.currentTimeMillis();
                Item item1 = new Item(key1, id1, name1, comments1, creat1);
                tracker.update(item1);
                String c = scanner1.nextLine();
            case 3:
                System.out.println("Введите id пользователя: ");
                Scanner scanner2 = new Scanner(System.in);
                String id2 = scanner2.nextLine();
                tracker.delete(id2);
                //String d = scanner.nextLine();
            case 4:
                System.out.println("Введите id пользователя: ");
                Scanner scanner3 = new Scanner(System.in);
                String id3 = scanner3.nextLine();
                tracker.findById(id3);
                //String e = scanner.nextLine();
            case 5:
                System.out.println("Введите имя пользователя: ");
                Scanner scanner4 = new Scanner(System.in);
                String name2 = scanner4.nextLine();
                tracker.findByName(name2);
                //String g = scanner.nextLine();
            case 6:
                System.out.println("Выйти из программы: ");
                Scanner scanner5 = new Scanner(System.in);
                String name3 = scanner5.nextLine();
                if (name3.equals("y")) {
                    break;
                } else {
                    return init();
                }
        }
        return 0;
    }
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Input inputCons = new ConsoleInput();
        new StartUI(inputCons, tracker).init();
    }
}
