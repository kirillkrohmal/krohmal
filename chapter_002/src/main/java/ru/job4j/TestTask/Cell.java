package ru.job4j.TestTask;

import java.util.Arrays;

/**
 * Created by Comp on 03.07.2017.
 */
public class Cell {
    int[][] cells = new int[][]{
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
    };

    public int width;
    public int height;

    public Cell(int[][] cells, int width, int height) {
        this.cells = cells;
        this.width = width;
        this.height = height;
    }

    public Cell(Cell dist) {

    }

    public int[][] getCells() {
        return cells;
    }

    public void setCells(int[][] cells) {
        this.cells = cells;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cell cell = (Cell) o;

        if (width != cell.width) return false;
        if (height != cell.height) return false;
        return Arrays.deepEquals(cells, cell.cells);
    }

    @Override
    public int hashCode() {
        int result = Arrays.deepHashCode(cells);
        result = 31 * result + width;
        result = 31 * result + height;
        return result;
    }

    @Override
    public String toString() {
        return "Cell{" +
                "cells=" + Arrays.toString(cells) +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}

