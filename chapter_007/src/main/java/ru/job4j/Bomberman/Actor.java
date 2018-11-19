package ru.job4j.Bomberman;

import javafx.scene.control.Cell;

/**
 * Created by Comp on 11.08.2018.
 */
public class Actor  {
    protected final Board board;

    /**
     * Position of actor at the board.
     */
    protected int x;

    /**
     * Position of actor at the board.
     */
    protected int y;

    /**
     * Create a new actor.
     * @param board instance of board class.
     * @param x position at the board.
     * @param y position at the board.
     */
    public Actor(Board board, int x, int y) {
        this.board = board;
    }
    protected boolean isValidMoving(Direction direction) {
        boolean valid = false;
        if (direction == Direction.DOWN) {
            valid = (y + 1) < board.getHeight() && board.getBlock(x, y + 1).getType() == BlockType.EMPTY;
        } else if (direction == Direction.UP) {
            valid = (y - 1) >= 0 && board.getBlock(x, y - 1).getType() == BlockType.EMPTY;
        } else if (direction == Direction.LEFT) {
            valid = (x - 1) >= 0 && board.getBlock(x, y - 1).getType() == BlockType.EMPTY;
        } else if (direction == Direction.RIGHT) {
            valid = (x + 1) < board.getWidth() && board.getBlock(x + 1, y).getType() == BlockType.EMPTY;
        }
        return valid;
    }

    /**
     * Update coordinates of this actor.
     * @param direction for moving.
     */
    public void updateCoordinates(Direction direction) {
        if (direction == Direction.DOWN) {
            y++;
        } else if (direction == Direction.UP) {
            y--;
        } else if (direction == Direction.LEFT) {
            x--;
        } else if (direction == Direction.RIGHT) {
            x++;
        }
    }

    /**
     * Moving actor.
     *
     * @param direction for moving.
     */
    void performMoving(Direction direction) {

    }

    /**
     * Return x axis position of actor.
     * @return x axis position.
     */
    public int getX() {
        return this.x;
    }

    /**
     * Return y axis position of actor.
     * @return y axis position of actor.
     */
    public int getY() {
        return this.y;
    }

}
