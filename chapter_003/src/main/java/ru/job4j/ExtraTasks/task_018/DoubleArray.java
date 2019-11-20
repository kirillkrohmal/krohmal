package ru.job4j.ExtraTasks.task_018;

/**
 * Задан двойной массив, заполненный нулями и единицами.
 * Нужно определить самое большое множество единиц. Множеством считается объединение единиц,
 * которые соприкасаются друг с другом. Диагональное соприкосновение не учитывать.
 */
public class DoubleArray {
    private int counter = 0;
    private final int connected = 3;
    int count1 = 0;
    int count2 = 0;

    public int[][] nullCount(int[][] nulls) {

        for (int i = 0; i < nulls.length; i++) {
            for (int j = 0; j < nulls.length; j++) {
                if (nulls[i][0] == nulls[i][j]) {
                    count1++;
                    break;
                } else if (nulls[j][i] == nulls[0][i]) {
                    count2++;
                    break;
                }
            }
        }
        if (count1 > count2) {
            return new int[][]{};
        } else if (count1 < count2) {
            return new int[][]{};
        }


        return new int[0][];
    }
}
