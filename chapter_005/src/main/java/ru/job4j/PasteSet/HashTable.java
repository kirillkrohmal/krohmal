package ru.job4j.PasteSet;


/**
 * Created by Comp on 13.10.2017.
 */
public class HashTable {
    PasteSet[] table;
    int count;
    int size;

    public HashTable (int size) {
        this.size = size;
        table = new PasteSet[size];
    }
}
