package ru.job4j.TestTask;

import ru.job4j.TestTask.figures.Bishop;

import java.util.Arrays;

/**
 * Created by Comp on 03.07.2017.
 */
public class Cell {
    int index = 8;
    String number = null;
    Cell[][] cells = new Cell[][]{};

    public int width;
    public int height;

    public Cell(int width, int height) {
        this.width = width;
        this.height = height;
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
        return Arrays.equals(cells, cell.cells);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(cells);
        result = 31 * result + width;
        result = 31 * result + height;
        return result;
    }

    @Override
    public String toString() {
        return "Cell{" +
                "index=" + index +
                ", number=" + number +
                ", cells=" + Arrays.toString(cells) +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}

