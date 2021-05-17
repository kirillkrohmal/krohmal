package ru.job4j;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StartUI {
    @Autowired
    private Store store;

    void add(String value) {
        store.add(value);
    }

    Store print() {
        for (String value : store.getAll()) {
            System.out.println(value);
        }

        return store;
    }
}
