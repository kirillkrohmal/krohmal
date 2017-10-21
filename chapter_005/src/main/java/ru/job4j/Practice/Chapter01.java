package ru.job4j.Practice;

/**
 * Created by Comp on 19.10.2017.
 */

class Chapter01 {
    int[][] temperatutes = new int[][]{
            {1, 2, 3},
            {1, 2, 3},
            {1, 2, 3}
    };

    void setTemperatutes(int[][] temp) {
        this.temperatutes = temp;
    }

    int[][] getTemperatutes() {
        return temperatutes;
    }

    Chapter01() {

    }


    public void tempeture() {


        for (int row = 0; row < temperatutes.length; row++) {
            for (int column = 0; column < temperatutes[row].length; column++)
                System.out.print(temperatutes[row][column] + " ");
            System.out.println();
        }
    }
}



