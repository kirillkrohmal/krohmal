package ru.job4j.testtask;

import java.util.Arrays;

/**
 * Created by Comp on 03.07.2017.
 */
public class Cell {
    int index = 8;
    private Figure[] figures;

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
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Cell cell = (Cell) o;

        if (index != cell.index) {
            return false;
        }
        if (width != cell.width) {
            return false;
        }
        if (height != cell.height) {
            return false;
        }
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(figures, cell.figures);
    }

    @Override
    public int hashCode() {
        int result = index;
        result = 31 * result + Arrays.hashCode(figures);
        result = 31 * result + width;
        result = 31 * result + height;
        return result;
    }
}

