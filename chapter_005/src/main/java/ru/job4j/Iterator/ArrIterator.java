package ru.job4j.Iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Comp on 04.09.2017.
 */

public class ArrIterator implements Iterator {
    private int[][] value;
    private int row = 0, column = 0;

    public int[][] getValue() {
        return value;
    }

    public void setValue(int[][] value) {
        this.value = value;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public ArrIterator(int[][] value) {
        this.value = value;
    }

    @Override
    public boolean hasNext() {
        boolean isPresent = false;
        if (value.length > row && column < value[0].length) {
            isPresent = true;
        }
        return isPresent;
    }

    @Override
    public Object next() {
        int nextValue = 0;
        if (hasNext()) {
            if (column < value[row].length) {
                nextValue = value[row][column++];
            }
            if (column == value[row].length) {
                switchElement();
            }
        } else {
            throw new NoSuchElementException();
        }
        return nextValue;
    }

    private void switchElement() {
        row++;
        column = 0;
    }
}





