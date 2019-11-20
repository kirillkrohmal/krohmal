package ru.job4j.game;



/**
 * Class Board.
 *
 * @author Krohmal Kirill (mailto:krohmal_kirill@mail.ru)
 * @since 08.07.2017
 */
public class Board {
    /** @since 07.07.2017
     * @param cells задает значение.
     */
    private static Cell[][] cells;
    /** @since 07.07.2017
     * @param hight задает значение.
     */
    public int hight;
    /** @since 07.07.2017
     * @param width задает значение.
     */
    public int width;

    public Board(Cell cells, int width, int hight) {
        this.cells = new Cell[width][hight];
        this.hight = hight;
        this.width = width;
    }
    /**
     * @since 07.07.2017
     * Метод field дл¤ класса Board проходит по массиву клеток
     */
    public void field(Cell[][] cells) {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells.length; j++) {
                cells[i][j] = new Cell();
            }
        }
    }
}