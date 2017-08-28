package ru.job4j.ExtraTasks.task_018;

/**
 * Задан двойной массив, заполненный нулями и единицами.
 * Нужно определить самое большое множество единиц. Множеством считается объединение единиц,
 * которые соприкасаются друг с другом. Диагональное соприкосновение не учитывать.
 */
public class DoubleArray {
    private int counter = 0;
    private final int connected = 3;

    public int[][] nullCount(int[][] nulls) {

        for (int i = 0; i < connected - counter; i++) {
            for (int j = 0; j < nulls.length; j++) {
                if (nulls[i][0] == nulls[i][j]) {

                } else if (nulls[j][i] == nulls[0][i]) {

                }
            }
        }
        return new int[0][];
    }
}
