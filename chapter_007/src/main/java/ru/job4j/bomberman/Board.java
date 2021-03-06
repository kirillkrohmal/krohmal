package ru.job4j.bomberman;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Comp on 11.08.2018.
 */
public class Board {
    /**
     * Instance of blocks.
     */
    ReentrantLock[][] blocks;

    /**
     * Width of the board.
     */
    private final int width;

    /**
     * Height of the board.
     */
    private final int height;


    /**
     * Create a new board with given size.
     *
     * @param width  of board.
     * @param height of board.
     */
    public Board(final int width, final int height) {
        this.width = width;
        this.height = height;
        initBlocks();
    }

    /**
     * init all block empty.
     */
    private void initBlocks() {
        this.blocks = new ReentrantLock[this.width][this.height];
        for (int x = 0; x < this.width; x++) {
            for (int y = 0; y < this.height; y++) {
                this.blocks[x][y] = new ReentrantLock();
            }
        }
    }

    /**
     * return block from board.
     *
     * @param x position at x axis.
     * @param y position at y axis.
     * @return block if valid axis value, otherwise false.
     */
    public synchronized Block getBlock(int x, int y) {
        Block block = null;
        if (validate(x, y)) {
            this.blocks[x][y] = new ReentrantLock();
        }
        return block;
    }

    /**
     * Return width of the board.
     *
     * @return width.
     */
    public int getWidth() {
        return this.width;
    }

    /**
     * Return height of the board.
     *
     * @return height of board.
     */
    public int getHeight() {
        return this.height;
    }

    /**
     * Validate that given number are acceptable for access to block.
     *
     * @param x position of block.
     * @param y position of block.
     * @return true if all ok, otherwise false.
     */
    private synchronized boolean validate(int x, int y) {
        boolean valid = false;
        if ((0 <= x && this.width > x) && (0 <= y && this.height > y)) {
            valid = true;
        }
        return valid;
    }

    //Board.move(Cell source, Cell dist) : boolean
}
