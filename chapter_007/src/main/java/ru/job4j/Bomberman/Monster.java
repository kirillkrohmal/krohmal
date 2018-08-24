package ru.job4j.Bomberman;

/**
 * Created by Comp on 11.08.2018.
 */
public class Monster extends Actor implements Runnable {


    public Monster(int x, int y) {
        super(x, y);
    }

    public Monster(Board board) {
        super(board);
    }

    @Override
    public void run() {

    }
}
