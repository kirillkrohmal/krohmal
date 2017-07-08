package ru.job4j.Game;


/**
 * Класс Board описывает поле клеток Игры крестики-нолики
 */
public class Board {
    private Cell[][] cells;
    private int width;
    private int hight;

    public Board(Cell[][] cells, int width, int hight) {
        this.cells = new Cell[width][hight];
        this.hight = hight;
        this.width = width;
    }

    //Метод print печатает на консоль итоговую матрицу
    public void print() {

    }


    public Board(Cell[] cells, Player player) {
        for (int i = 0; i < player.getX(); i++) {
            for (int j = 0; j < player.getY(); j++) {
                System.out.println(String.format("%s", i, j));
            }
        }
    }

    public void field(Cell[][] cells) {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells.length; j++) {
                cells[i][j] = new Cell();
            }
        }
    }


    public boolean isTrueOrFalse() {


        return false;
    }
}
