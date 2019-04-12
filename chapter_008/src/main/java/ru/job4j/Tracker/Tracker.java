package Tracker;

import Tracker.actions.UserAction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Comp on 12.06.2017.
 */
public class Tracker {
    private final int STORAGE_SIZE = 200;
    List<UserAction> userActionList = new ArrayList<>(STORAGE_SIZE);


    private int size = 0;

    public Item add (Item item) {
        if (size == STORAGE_SIZE - 1) {
            System.out.println();
        }

        userActionList.add()
        return item;
    }

    public Item delete () {
        for (int i = 0; i < userActionList.size(); i++) {
            if (userActionList.get(i) != null && ) {

            }
        }
    }

    public Item update () {

    }

    public Item findByName () {

    }

    public Item findById () {

    }

    public Item findAll () {

    }
}
