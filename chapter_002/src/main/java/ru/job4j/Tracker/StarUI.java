package ru.job4j.Tracker;

/**
 * Created by Comp on 12.06.2017.
 */
public class StarUI {

    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        tracker.add(new Task("asdasd", "243", "2342", "234234", 12322222));
        tracker.add(new Task("tgbtgb", "2543", "23666tg42", "23423tgtg4", 1232255222));

        for (Item item : tracker.findAll()) {
            System.out.println(item.getName());
            System.out.println(item.getKey());
            System.out.println(item.getDesc());
            System.out.println(item.getCreated());
        }

        tracker.delete("243");
    }

   /* public default void init() {
        while(true) {

        }
    }*/
}
