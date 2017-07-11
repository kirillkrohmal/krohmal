package ru.job4j.Game;


/**
 * Класс Board описывает поле клеток Игры крестики-нолики
 */
public class Board {
    private Cell[][] cells;
    private int width;
    private int hight;
    Player player;

    public Board(Cell[][] cells, int width, int hight) {
        this.cells = new Cell[width][hight];
        this.hight = hight;
        this.width = width;
    }

    //Метод print печатает на консоль итоговую матрицу
    public void print() {

    }


    public Board(Cell[][] cells, Player player) {
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

    public void left() {
        player.x--;
    }

    public void right() {
        player.x--;
    }

    public void up() {
        player.x--;
    }

    public void down() {
        player.x--;
    }


    public boolean isTrueOrFalse() {


        return false;
    }
}
