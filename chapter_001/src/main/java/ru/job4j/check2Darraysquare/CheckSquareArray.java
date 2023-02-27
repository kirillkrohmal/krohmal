package ru.job4j.check2Darraysquare;

public class CheckSquareArray {
    public static boolean checkArray(int[][] array) {
        boolean rsl = true;
        int standard = array.length;
        for (int i = 0; i < standard - 1; i++) {
            if (i != standard) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
