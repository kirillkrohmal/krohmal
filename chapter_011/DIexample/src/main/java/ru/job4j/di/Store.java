package ru.job4j.di;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<String> data = new ArrayList<String>();

    void add(String value) {
        data.add(value);
    }

    List<String> getAll() {
        return data;
    }
}
