package ru.job4j.Game2;

/**
 * Created by Comp on 27.07.2017.
 */
public class TicTac {
    private int counter = 0;
    private final int connected = 3;

    public TicTac(int[][] board) {
        for (int i = 0; i < connected - counter; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][0] == board[i][j]) {
                    counter++;
                    if (counter == 3) {
                        break;
                    }
                    if (board[i] == board[j]) {
                        counter++;
                        if (counter == 3) {
                            break;
                        }
                    }
                    if (board[j][i] == board[0][i]) {
                        counter++;
                        if (counter == 3) {
                            break;
                        }
                    }
                }
            }
        }
    }

    public boolean hasWin() {
        return (counter == connected) ? true : false;
    }
}


