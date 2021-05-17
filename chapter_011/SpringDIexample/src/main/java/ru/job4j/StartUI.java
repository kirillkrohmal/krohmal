package ru.job4j;

public class StartUI {
    private Store store;

    private StartUI(Store store) {
        this.store = store;
    }

    private void add(String value) {
        store.add(value);
    }

    public void print() {
        for (String value : store.getAll()) {
            System.out.println(value);
        }
    }
}
