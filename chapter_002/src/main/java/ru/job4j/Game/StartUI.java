package ru.job4j.Game;

import java.util.Arrays;

/**
 * Created by Comp on 15.07.2017.
 */
public class StartUI {
    Player player;
    StartUI game;
    private static Cell[][] cells;
    private Validate input = new StubInput(new String[]{});

    public StartUI(Board board, Player player) {
        for (int i = 0; i < player.getX(); i++) {
            for (int j = 0; j < player.getY(); j++) {
                System.out.println(String.format("%s, %s", i, j));
            }
        }
    }

    public void print() {
        System.out.println(StartUI.cells);
    }

    void move() {
        player.left();
        player.right();
        player.up();
        player.down();
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

    public void init() {
        move();
        print();
    }

    public static void main(String[] args) {
        Board board = new Board(cells, 3, 3);
        System.out.println(String.format("%s", board));
        //System.out.println(String.format("%s", st.player));
        //System.out.println(Arrays.deepToString(Board.cells));
        Validate validate = new StubInput(new String[3]);
        Player player = new Player(2, 3);
        new StartUI(board, player).init();
    }
}
