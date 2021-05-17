package ru.job4j.di;

import org.springframework.beans.factory.annotation.Autowired;

public class StartUI {
    private Store store;

    @Autowired
    public StartUI(Store store) {
        this.store = store;
    }

    void add(String value) {
        store.add(value);
    }

    void print() {
        for (String value : store.getAll()) {
            System.out.println(value);
        }
    }
}
