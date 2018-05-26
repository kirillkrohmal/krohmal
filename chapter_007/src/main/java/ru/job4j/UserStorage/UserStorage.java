package ru.job4j.UserStorage;

import net.jcip.annotations.ThreadSafe;

/**
 * Created by Comp on 29.10.2017.
 */
@ThreadSafe
public class UserStorage {
    private static final int STORAGE = 1000;
    private User[] storage = new User[STORAGE];
    private Integer[] sum = new Integer[]{};

    private int size = 0;

    private final Object lock = new Object();

    public  void add(User user) {
        synchronized(this.lock) {
            if (size == STORAGE - 1) {
                System.out.println(String.format("Недостаточно места"));
            }
            storage[size++] = user;
        }
    }

    public User update(User user) {
        synchronized(this.lock) {
            for (int i = 0; i < storage.length; i++) {
                if (storage[i] != null) {

                }
            }

        }
        return null;
    }

    public void delete(int id) {
        synchronized(this.lock) {
            for (int i = 0; i < storage.length; i++) {
                if (storage[i] != null && storage[i].getId() == id) {
                    storage[i] = null;
                }
            }
        }
    }

    public boolean transfer(int fromId, int toId, int amount) {
        synchronized(this.lock) {
            sum[fromId] =- amount;
            sum[toId] += amount;
        }
        return false;
    }
}
