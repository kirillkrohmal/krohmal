package ru.job4j.checkSquareArray;

public class CheckSquareArray {
    public static boolean checkArray(int[][] array) {
        boolean rsl = true;
        int standard = array.length;
        for (int i = 0; i < standard; i++) {
            if (array.length !=standard){
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
