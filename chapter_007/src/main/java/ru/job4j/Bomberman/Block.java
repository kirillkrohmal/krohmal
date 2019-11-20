package ru.job4j.Bomberman;

/**
 * Created by Comp on 11.08.2018.
 */
public class Block {
    private final BlockType type;

    private Actor actor;

    public Block(final BlockType type) {
        this.type = type;
    }

    public synchronized void attachActor(Actor actor) {
        this.actor = actor;
    }

    public synchronized void detachActor() {
        this.actor = null;
    }

    public synchronized Actor getActor() {
        return this.actor;
    }

    public BlockType getType() {
        return type;
    }
}
