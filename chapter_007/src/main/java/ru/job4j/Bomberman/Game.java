package ru.job4j.Bomberman;

import java.util.Random;

/**
 * Created by Comp on 20.11.2018.
 */
public class Game  {
    private static final Random RN = new Random();

    private Board board;
    private Thread[] enemies;

    public Game(int width, int height, int enemy) {

        this.board = new Board(width, height);
        this.enemies = enemies;
    }

    public static void main(String[] args) {
        Board board = new Board(10, 20);
        Thread thread = new Thread(String.valueOf(new Player(board, 14, 5)));
        thread.start();
    }



    private void initMonster() {
        for (Thread thread : this.enemies) {
            int x = RN.nextInt(board.getWidth());
            int y = RN.nextInt(board.getHeight());
            if (board.getBlock(x, y).getActor() == null) {
                thread = new Thread(new Monster(board, x, y));
            }
        }
    }
}