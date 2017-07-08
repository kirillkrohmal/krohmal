package ru.job4j.TestTask;

/**
 * Created by Comp on 03.07.2017.
 */
public class Cell {

    private Cell source;
    private Cell dist;

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

    public Cell() {
        ChessFigure cell = new ChessFigure(3,1);
    }

    /*public String paint(int higth) {

        Cell[] cell = new Cell[]{};

        StringBuilder builder = new StringBuilder();
        String line = System.getProperty("line.separator");

        int width = 2 - higth/2;


        for (int i = 0; i <= higth; i++) {
            for (int j = 0; j <= width; j++) {

            }
        }
        return builder.toString();
    }*/
}
