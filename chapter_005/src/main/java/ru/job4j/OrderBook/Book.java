package ru.job4j.OrderBook;

import java.util.Collection;
import java.util.Comparator;

/**
 * Created by Comp on 12.11.2017.
 */
public class Book {
    private Collection<Orders> orders;

    public Book(Collection<Orders> orders) {
        this.orders = orders;
    }

    Comparator<Float> singleComparator = new Comparator<Float>() {
        @Override
        public int compare(Float o1, Float o2) {
            return o1.compareTo(o2);
        }
    };

    Comparator<Float> doubleComparator = new Comparator<Float>() {
        @Override
        public int compare(Float o1, Float o2) {
            return o1.compareTo(o2);
        }
    };

    Comparator<Float> treeComparator = new Comparator<Float>() {
        @Override
        public int compare(Float o1, Float o2) {
            return o1.compareTo(o2);
        }
    };

    public void add() {

    }
}
