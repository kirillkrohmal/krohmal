package ru.job4j.game;

import java.util.Random;


/**
 * Class Player.
 *
 * @author Krohmal Kirill (mailto:krohmal_kirill@mail.ru)
 * @since 07.07.2017.
 */
public class Player {
    /** @since 07.07.2017
     * @param x задает значение.
     */
    int x;
    /** @since 07.07.2017
     * @param y задает значение.
     */
    int y;
    /** @since 07.07.2017
     * @param game задает значение.
     */
    public Board game;
    /** @since 07.07.2017
     * @param player задает значение.
     */
    Player player;
    /** @since 07.07.2017
     * @param random задает значение.
     */
    private static final Random random = new Random();

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
        return random.nextInt();
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
