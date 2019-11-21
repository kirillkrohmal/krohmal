package ru.job4j.game;

import java.util.Random;


/**
 * Class Player.
 *
 * @author Krohmal Kirill (mailto:krohmal_kirill@mail.ru)
 * @since 07.07.2017.
 */
public class Player {
    /**
     * @param x задает значение.
     * @since 07.07.2017
     */
    int x;
    /**
     * @param y задает значение.
     * @since 07.07.2017
     */
    int y;
    /**
     * @param game задает значение.
     * @since 07.07.2017
     */
    public Board game;
    /**
     * @param player задает значение.
     * @since 07.07.2017
     */
    Player player;
    /**
     * @param random задает значение.
     * @since 07.07.2017
     */
    private static final Random RANDOM = new Random();

    public Player(int x, int y, char[] cell) {
        this.x = x;
        this.y = y;
    }

    /**
     * @return random возвращает результат
     * @since 07.07.2017
     * Метод getRandomCell дл¤ класса Player создает значение рандомно
     */
    int getRandomCell() {
        return RANDOM.nextInt();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "ChessFigure{"
                + "x=" + x
                + ", y=" + y
                + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Player player = (Player) o;

        if (x != player.x) {
            return false;
        }
        return y == player.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }

    public int left() {
        player.y--;
        player.x++;
        return 0;
    }

    public int right() {
        player.x--;
        player.y++;
        return 0;
    }

    public int up() {
        player.x--;
        player.y--;
        return 0;
    }

    public int down() {
        player.x++;
        player.y++;
        return 0;
    }
}
