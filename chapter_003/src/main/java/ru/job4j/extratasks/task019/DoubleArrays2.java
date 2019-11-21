package ru.job4j.extratasks.task019;

/**
 * Задан двойной массив из единиц и нулей. Нужно найти минимальный путь от точки А до точки В.
 * Двигаться можно только по единицам и только по вертикали или горизонтали.
 */
public class DoubleArrays2 {
    private int count;

    public int[][] nullCount2(int[][] nulls) {
        for (int i = 0; i < nulls.length; i++) {
            for (int j = 0; j < nulls.length; j++) {
                if (nulls[i][0] == nulls[i][j]) {
                    count++;
                    if (count == 3) {
                        break;
                    }
                }
                if (nulls[i] == nulls[j]) {
                    count++;
                    if (count == 3) {
                        break;
                    }
                }
                if (nulls[j][i] == nulls[0][i]) {
                    count++;
                    if (count == 3) {
                        break;
                    }
                }

            }
        }
        return new int[0][];
    }
}

