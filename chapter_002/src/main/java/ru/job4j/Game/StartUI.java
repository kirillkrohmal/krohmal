package ru.job4j.Game;

import java.util.Arrays;

/**
 * Created by Comp on 15.07.2017.
 */
public class StartUI {
    private static Player player;
    //private static final int LEFT = player.left();
    //private static final int RIGHT = player.right();
    //private static final int UP = player.up();
    //private static final int DOWN = player.down();
    private static int index;

    Board board;
    StartUI game;
    private static Cell cells;
    int position = 0;

    private Validate input = new StubInput(new String[]{});

   /* public StartUI(Board board, Player player) {
        for (int i = 0; i < player.getX(); i++) {
            for (int j = 0; j < player.getY(); j++) {
                System.out.println(String.format("%s, %s", i, j));
            }
        }
    }*/

    public void print() {

        Cell[][] print = new Cell[board.width][board.hight];

        for (int i = 0; i < board.hight; i++) {
            for (int j = 0; j < board.width; j++) {
                print[i][j] = cells;
            }
        }
        player.setX(player.getRandomCell());
        player.setY(player.getRandomCell());

        //System.out.println(StartUI.cells);
    }

    void move() {
        if (position == player.left()) {
            player.left();
        } else if (position == player.left()) {
            player.right();
        } else if (position == player.left()) {
            player.up();
        } else if (position == player.left()) {
            player.down();
        }
    }

    public boolean isTrueOrFalse(String[] cell, String[] sameElements) {
        boolean result = false;
        int count = 0;

        for (int i = 0; i < cell.length; i++) {
            for (int j = 0; j < cell.length; j++) {
                if (cell[i + j].equals(sameElements[j])) {
                    count++;
                    if (count >= 3) {
                        result = true;
                    }

                    break;
                }
                if (cell[i + j].equals(sameElements[j])) {
                    count++;
                    if (count <= 10) {
                        result = false;
                    }
                    break;
                } else {
                    if (count < 2) {
                        result = false;
                    }
                    break;
                }
            }
        }
        return result;
    }


    public void init() {
        //board.field(new Cell[][]{});
        //move();
        //isTrueOrFalse();
        print();

    }

    public static void main(String[] args) {
        Board board = new Board(cells, 5, 5);
        //System.out.println(String.format("%s", board));
        //System.out.println(String.format("%s", st.player));
        //System.out.println(Arrays.deepToString(Board.cells));
        Validate validate = new StubInput(new String[6]);
        //new StartUI(board, player).init();
    }
}
