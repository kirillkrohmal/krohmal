package ru.job4j.ExtraTasks.task_016;

/**
 * Задан квадратный массив. Нужно проверить, что в нем есть выигрышные варианты для игры крестики-нолики.
 */
public class TicTacChoice {
    private int count = 0;
    private int counter = 3;

    public void TicTacChoice(int[][] board) {

        for (int i = 0; i < counter - count; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][0] == board[i][j]) {
                    count++;
                    if (count == 3) {
                        break;
                    }
                }
                if (board[i] == board[j]) {
                    count++;
                    if (count == 3) {
                        break;
                    }
                }
                if (board[j][i] == board[0][i]) {
                    count++;
                    if (count == 3) {
                        break;
                    }
                }
            }
        }
    }

    public boolean whoWin() {
        return (counter == count) ? true : false;
    }
}
