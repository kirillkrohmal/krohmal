package ru.job4j.ExtraTasks.task_017;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Реализован банкомат размена денег. Автомат принимает бумажную купюру и обменивает на монеты.
 * Метод должен возвращать список всех возможных вариантов размены купюры.
 * 1. вынеси монеты в константы. 1, 2, 5, 10
 * 2. а дальше в цикле добавляй в список монеты чтобы сумма всех элементов не превышала сумму,
 * которую нужно разменять.
 * 3. а далее просто когда делаешь очередной список монет сравнивай его с теми списками  которые ты уже сформировал
 * в цикле делай что-то типа того: пока сумма элементов листа не = сумме которую нужно обменять то цикл крутится.
 * если сумма элементов листа < 5 то добавляем в лист 5, если сумма < 2 то добавляем 2 и т.д.
 */
public class MoneyATM {
    private static final int NUMBER_OF_ONE = 1;
    private static final int NUMBER_OF_TWO = 2;
    private static final int NUMBER_OF_FIVE = 5;
    private static final int NUMBER_OF_TEN = 10;

    private final int[] values;
    int money = 0;
    private int sum;

    public MoneyATM(final int[] values) {
        this.values = values;
    }

    public void changers (int a, int b, int c, int d) {

        int[] source = values;

        for (int i = 0; i < source[NUMBER_OF_TEN]; i++) {
            for (int j = 0; j < source[NUMBER_OF_FIVE]; j++) {
                for (int k = 0; k < source[NUMBER_OF_TWO]; k++) {
                    for (int l = 0; l < source[NUMBER_OF_ONE]; l++) {
                        sum = i/10 + j/5 + k/2 + d/1;
                    }
                }
            }
        }
    }


    public List<List<Integer>> exchange(int note) {
        List<List<Integer>> list = new ArrayList<List<Integer>>(values.length);
        List<Integer> listInt = new ArrayList<Integer>();


        listInt.add(NUMBER_OF_ONE);
        listInt.add(NUMBER_OF_TWO);
        listInt.add(NUMBER_OF_FIVE);
        listInt.add(NUMBER_OF_TEN);

        for (int values = 0; values < sum; values++) {
            if (listInt.size() < 1) {
                list.add(new ArrayList<>(1));
            } else if (listInt.size() < 2) {
                list.add(new ArrayList<>(2));
            } else if (listInt.size() < 5) {
                list.add(new ArrayList<>(5));
            } else if (listInt.size() < 10) {
                list.add(new ArrayList<>(10));
            }
        }

        return list;
    }
}
