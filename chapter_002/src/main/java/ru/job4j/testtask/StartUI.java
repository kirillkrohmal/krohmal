package ru.job4j.testtask;


import ru.job4j.testtask.figures.Bishop;

/**
 * Created by Comp on 15.07.2017.
 */
public class StartUI {
    private static Figure figure;
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
            bishop.upAndLeft(new Cell[][]{}, 6, 5);
        } else if (position.equals(MoveChess.RIGHT)) {
            bishop.upAndRigth(new Cell[][]{}, 5, 1);
        } else if (position.equals(MoveChess.UP)) {
            bishop.downAndLeft(new Cell[][]{}, 3, 6);
        } else if (position.equals(MoveChess.DOWN)) {
            bishop.downAndRigth(new Cell[][]{}, 7, 3);
        }
    }

    public void init() {
        //position.move(new Cell(6, 7), new Cell(3, 1));
        position.print();
    }

    public static void main(String[] args) {
        Board board = new Board(8, 8, new char[][]{});
        Figure figure = new Bishop(5, 6, new Cell(4, 4), 8, 8);
        new StartUI(board, figure).init();
    }
}
