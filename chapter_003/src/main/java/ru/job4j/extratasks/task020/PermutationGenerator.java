package ru.job4j.extratasks.task020;

import java.util.ArrayList;
import java.util.List;

/**
 * Задан одномерный массив. Нужно найти все возможные варианты перестановок этого массива.
 */
public class PermutationGenerator {

    private final int[] values;

    public PermutationGenerator(final int[] values) {
        this.values = values;
    }

    public List<List<Integer>> generate() {
        ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();

        result.add(new ArrayList<Integer>());

        for (int i = 0; i < values.length; i++) {
            ArrayList<ArrayList<Integer>> gen = new ArrayList<ArrayList<Integer>>();

            for (List<Integer> integers : result) {
                for (int j = 0; j < integers.size() + 1; j++) {
                    integers.add(j, values[i]);

                    ArrayList<Integer> res = new ArrayList<Integer>();
                    gen.add(res);

                    integers.remove(j);
                }
            }
            result = new ArrayList<List<Integer>>(gen);
        }
        return result;
    }
}


