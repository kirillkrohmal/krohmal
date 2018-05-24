package ru.job4j.PasteSet;


/**
 * Created by Comp on 13.10.2017.
 */
public class HashTable {
    private PasteSet[] table;
    private int size;

    public HashTable (int size) {
        this.size = size;
        table = new PasteSet[size];
    }

    public PasteSet[] getTable() {
        return table;
    }

    public void setTable(PasteSet[] table) {
        this.table = table;
    }
}
