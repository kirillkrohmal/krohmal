package ru.job4j.Game;


import java.util.Arrays;

/**
 * Класс Board описывает поле клеток Игры крестики-нолики
 */
public class Board {
    private static Cell[][] cells;
    private int width;
    private int hight;
    Player player;

    public Board(Cell[][] cells, int width, int hight) {
        this.cells = new Cell[width][hight];
        this.hight = hight;
        this.width = width;
    }

    public Board(Cell[][] field, Player player) {
        for (int i = 0; i < player.getX(); i++) {
            for (int j = 0; j < player.getY(); j++) {
                System.out.println(String.format("%s, %s", i, j));
            }
        }
    }

    public Board() {
        move();
        print();
    }

    //Метод print печатает на консоль итоговую матрицу
    public void print() {
        System.out.println(Board.cells);
    }

    public void field(Cell[][] cells) {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells.length; j++) {
                cells[i][j] = new Cell();
            }
        }
    }

    void move() {
        player.game.left();
        player.game.right();
        player.game.left();
        player.game.right();
    }

    public void left() {
        player.y--;
        player.x++;
    }

    public void right() {
        player.x--;
        player.y++;
    }

    public void up() {
        player.x--;
        player.y--;
    }

    public void down() {
        player.x++;
        player.y++;
    }

    public boolean isTrueOrFalse() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells.length; j++) {
                if (cells[i][j] == null && player.getY() > 0 && player.getX() > 0) {
                    move();
                    return true;
                } else {
                    break;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Board board = new Board(cells, 3, 3);
        System.out.println(String.format("%s", board));
        System.out.println(String.format("%s", board.player));
        System.out.println(Arrays.deepToString(Board.cells));

    }
}
