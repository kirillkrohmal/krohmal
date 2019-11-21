package ru.job4j.pasteset;

import java.util.Hashtable;

/**
 * Created by Comp on 14.10.2017.
 */
public class PasteIt1<E> {
    private Hashtable hashtable;

    int size;

    public PasteIt1(Hashtable hashtable) {
        this.hashtable = hashtable;
    }

    public void setHashtable(Hashtable hashtable) {
        this.hashtable = hashtable;
    }

    boolean add(E e) {


        //map.put(e)

        return false;
    }

    boolean contains(E e) {

        return false;
    }

    boolean remove(E e) {

        //map.remove()

        return false;
    }


}
