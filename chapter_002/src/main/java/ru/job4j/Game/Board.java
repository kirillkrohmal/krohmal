package ru.job4j.Game;


import java.util.Arrays;

/**
 * Класс Board описывает поле клеток Игры крестики-нолики
 */
public class Board {
    private static Cell[][] cells;
    private int width;
    private int hight;

    public Board(Cell[][] cells, int width, int hight) {
        this.cells = new Cell[width][hight];
        this.hight = hight;
        this.width = width;
    }

    public void field(Cell[][] cells) {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells.length; j++) {
                cells[i][j] = new Cell();
            }
        }
    }
}
