package ru.job4j.Bomberman;

/**
 * Created by Comp on 11.08.2018.
 */
public enum Direction {
    UP {
        public int[] get() {
            return new int[]{0, 1};
        }

        /**
         * Change direction to another.
         * @return new direction.
         */

        @Override
        public Direction changeDir() {
            return RIGHT;
        }
    },

    DOWN {
        public int[] get() {
            return new int[]{0, -1};
        }

        /**
         * Change direction to another.
         * @return new direction.
         */
        @Override
        public Direction changeDir() {
            return LEFT;
        }
    },

    RIGHT {
        public int[] get() {
            return new int[]{1, 0};
        }

        /**
         * Change direction to another.
         * @return new direction.
         */
        @Override
        public Direction changeDir() {
            return DOWN;
        }
    },

    LEFT {
        public int[] get() {
            return new int[]{-1, 0};
        }

        /**
         * Change direction to another.
         * @return new direction.
         */
        @Override
        public Direction changeDir() {
            return UP;
        }
    };

    public abstract int[] get();

    public abstract Direction changeDir();
}


