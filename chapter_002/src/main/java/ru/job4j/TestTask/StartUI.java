package ru.job4j.TestTask;


import ru.job4j.TestTask.Exception.ImpossibleMoveException;

/**
 * Created by Comp on 15.07.2017.
 */
public class StartUI {
    private ChessFigure player;
    private StartUI game;
    private Bishop bishop;
    private static Cell cells;
    //private Validate input = new StubInput(new String[]{});

    public StartUI(Board board, ChessFigure player) {
        for (int i = 0; i < player.getX(); i++) {
            for (int j = 0; j < player.getY(); j++) {
                System.out.println(String.format("%s, %s", i, j));
            }
        }
    }

    public void print() {
        System.out.println(StartUI.cells);
    }

    void move() {
        bishop.upAndRigth(new Cell[][]{});
        bishop.upAndLeft(new Cell[][]{});
        bishop.downAndLeft(new Cell[][]{});
        bishop.downAndRigth(new Cell[][]{});
    }

    public void init() {
        move();
        print();
    }

    public static void main(String[] args) {
        Board board = new Board(cells, new Figure[4], new Cell[][]{}, 5, 5);
        //System.out.println(String.format("%s", board));
        //System.out.println(String.format("%s", st.player));
        //System.out.println(Arrays.deepToString(Board.cells));
        ChessFigure player = new ChessFigure(8, 6, new Figure(new Cell(new int[2][2], 7, 6)) {
            @Override
            protected Object clone() throws CloneNotSupportedException {
                return super.clone();
            }

            @Override
            Cell[] way(Cell dist) throws ImpossibleMoveException {
                return super.way(dist);
            }
        });
        new StartUI(board, player).init();
    }
}
