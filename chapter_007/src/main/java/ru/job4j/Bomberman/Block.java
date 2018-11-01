package ru.job4j.Bomberman;

/**
 * Created by Comp on 11.08.2018.
 */
public class Block extends Figure {
    public Block(Cell[][] field, int x, int y) {
        super(field, x, y);
    }

    public boolean makeStep() {
        return false;
    }
}
