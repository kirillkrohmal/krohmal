package ru.job4j.TestTask;


import ru.job4j.TestTask.Exception.ImpossibleMoveException;
import ru.job4j.TestTask.figures.Bishop;

import java.util.Arrays;

/**
 * Created by Comp on 15.07.2017.
 */
public class StartUI {
    private static Figure figure;
    private ChessFigure player;
    private StartUI game;
    private Bishop bishop;
    private Cell cells;
    private Board position;

    public StartUI(Board board, Figure figure) {
        this.position = board;
        this.figure = figure;
    }

    public void print() {
        System.out.println(cells);
        System.out.println(position.move(new Cell(4, 3), new Cell(1, 3)));
    }

    void moveFigure() {
       /* if (chessFigures.getPosition()) {
            figures.downAndLeft(new Cell[4][3]);
        }
        if (chessFigures.getPosition()) {
            figures.downAndRigth(new Cell[3][2]);
        }
        if (chessFigures.getPosition()) {
            figures.upAndLeft(new Cell[1][4]);
        }
        if (chessFigures.getPosition()) {
            figures.upAndRigth(new Cell[3][5]);
        }*/
        if (position.equals(MoveChess.LEFT)) {
            bishop.upAndLeft(new Cell[][]{});
        } else if (position.equals(MoveChess.RIGHT)) {
            bishop.upAndRigth(new Cell[][]{});
        } else if (position.equals(MoveChess.UP)) {
            bishop.downAndLeft(new Cell[][]{});
        } else if (position.equals(MoveChess.DOWN)) {
            bishop.downAndRigth(new Cell[][]{});
        }
    }

    public void init() {
        //position.move();
        position.move(new Cell(4, 3), new Cell(1, 3));
        print();
    }

    public static void main(String[] args) {
        Board board = new Board(8, 8);
        //System.out.println(String.format("%s", board));
        //System.out.println(String.format("%s", st.player));
        //System.out.println(Arrays.deepToString(Board));
        Figure figure = new Bishop(new Cell(7, 7), new ChessFigure(new Cell(8, 6)));
        new StartUI(board, figure).init();
    }
}
