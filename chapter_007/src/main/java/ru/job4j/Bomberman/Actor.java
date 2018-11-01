package ru.job4j.Bomberman;

/**
 * Created by Comp on 11.08.2018.
 */
public class Actor extends Figure {


    int x;
    int y;

    public Actor(Cell[][] field, int x, int y) {
        super(field, x, y);
    }




    protected boolean isValidMoving(Direction direction) {
        boolean valid = false;
        if (direction == Direction.DOWN) {
            valid = (y + 1) < field.getHeight() && board.getBlock(x, y + 1).getType() == BlockType.EMPTY;
        } else if (direction == Direction.UP) {
            valid = (y - 1) >= 0 && board.getBlock(x, y - 1).getType() == BlockType.EMPTY;
        } else if (direction == Direction.LEFT) {
            valid = (x - 1) >= 0 && board.getBlock(x, y - 1).getType() == BlockType.EMPTY;
        } else if (direction == Direction.RIGHT) {
            valid = (x + 1) < board.getWidth() && board.getBlock(x + 1, y).getType() == BlockType.EMPTY;
        }
        return valid;
    }


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

}
