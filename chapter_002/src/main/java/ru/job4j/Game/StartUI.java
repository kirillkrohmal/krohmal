package ru.job4j.Game;

import java.util.Arrays;

/**
 * Created by Comp on 15.07.2017.
 */
public class StartUI {
    Player player;
    Board board;
    StartUI game;
    int position = 0;

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

        Cell[][] print = new Cell[board.width][board.hight];

        for (int i = 0; i < board.hight; i++) {
            for (int j = 0; j < board.width; j++) {
                print[i][j] = cells[i][j];
            }
        }
       /* player.setX(player.getRandomCell());
        player.setY(player.getRandomCell());
        cells[position++] = new Cell[]{};*/
        //System.out.println(StartUI.cells);
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
        Player player = new Player(1, 6);
        new StartUI(board, player).init();
    }
}
