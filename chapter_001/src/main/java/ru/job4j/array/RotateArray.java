package ru.job4j.array;

/**
 * Class RotateArray.
 *
 * @author Krohmal Kirill (mailto:krohmal_kirill@mail.ru)
 * @since 17.11.2019
 */
public class RotateArray {
    /**
     * @return array возвращает результат
     * @since 17.11.2019
     * Метод rotate дл¤ класса RotateArray поворачивает числовой массив
     * на одно деление
     */
    public int[][] rotate(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
            array[i] = new Turn().back(array[i]);
        }
        return array;
    }
}



		
	
	
