package ru.job4j.TestTask;

/**
 * Created by Comp on 20.05.2018.
 */
public class TestTask {
    public String showAlgorithm(String[] word1, String[] word2) {
        if (word1.length > 1) {
            String[] left = leftHalf(word1);
            //String[] right = rightHalf(word2);

            //showAlgorithm(left);
            //showAlgorithm(right);

            //merge(word1, left, right);
        }
        return null;
    }



    public String[] leftHalf(String[] array) {
        int size1 = array.length / 2;
        //String[] left = new int[size1];
        for (int i = 0; i < size1; i++) {
            //left[i] = Integer.parseInt(array[i]);
        }

        return null;
    }

    public static int[] rightHalf(String[] array) {
        int size1 = array.length / 2;
        int size2 = array.length - size1;
        int[] right = new int[size2];
        for (int i = 0; i < size2; i++) {
            right[i] = Integer.parseInt(array[i + size1]);
        }
        return right;
    }

    public static void merge(String[] result, int[] left, int[] right) {
        int i1 = 0;
        int i2 = 0;

        for (int i = 0; i < result.length; i++) {
            if (i2 >= right.length || (i1 < left.length && left[i1] <= right[i2])) {
                result[i] = String.valueOf(left[i1]);
                i1++;
            } else {
                result[i] = String.valueOf(right[i2]);
                i2++;
            }
        }
    }
}
