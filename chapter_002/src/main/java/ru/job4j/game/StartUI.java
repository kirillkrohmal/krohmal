package ru.job4j.game;

/**
 * Class StartUI.
 *
 * @author Krohmal Kirill (mailto:krohmal_kirill@mail.ru)
 * @since 15.07.2017.
 */
public class StartUI {
    /**
     * @param player задает значение.
     * @since 15.07.2017.
     */
    private static Player player;
    /**
     * @param index задает значение.
     * @since 15.07.2017.
     */
    private static int index;
    /**
     * @param board задает значение.
     * @since 15.07.2017.
     */
    Board board;
    /**
     * @param game задает значение.
     * @since 15.07.2017.
     */
    StartUI game;
    /**
     * @param cells задает значение.
     * @since 15.07.2017.
     */
    private static Cell cells;
    /**
     * @param position задает значение.
     * @since 15.07.2017.
     */
    int position = 0;

    private Validate input = new StubInput(new String[]{});

    public void print() {

        Cell[][] print = new Cell[board.width][board.hight];

        for (int i = 0; i < board.hight; i++) {
            for (int j = 0; j < board.width; j++) {
                print[i][j] = cells;
            }
        }
        player.setX(player.getRandomCell());
        player.setY(player.getRandomCell());

        //System.out.println(StartUI.cells);
    }

    void move() {
        if (position == player.left()) {
            player.left();
        } else if (position == player.left()) {
            player.right();
        } else if (position == player.left()) {
            player.up();
        } else if (position == player.left()) {
            player.down();
        }
    }

    public boolean isTrueOrFalse(String[] cell, String[] sameElements) {
        boolean result = false;
        int count = 0;

        for (int i = 0; i < cell.length; i++) {
            for (int j = 0; j < cell.length; j++) {
                if (cell[i + j].equals(sameElements[j])) {
                    count++;
                    if (count >= 3) {
                        result = true;
                    }

                    break;
                }
                if (cell[i + j].equals(sameElements[j])) {
                    count++;
                    if (count <= 10) {
                        result = false;
                    }
                    break;
                } else {
                    if (count < 2) {
                        result = false;
                    }
                    break;
                }
            }
        }
        return result;
    }


    public void init() {
        //board.field(new Cell[][]{});
        //move();
        //isTrueOrFalse();
        print();

    }

    public static void main(String[] args) {
        Board board = new Board(cells, 5, 5);
        //System.out.println(String.format("%s", board));
        //System.out.println(String.format("%s", st.player));
        //System.out.println(Arrays.deepToString(Board.cells));
        Validate validate = new StubInput(new String[6]);
        //new StartUI(board, player).init();
    }
}
