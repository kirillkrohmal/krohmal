package ru.job4j.Practice.ContainsAll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Comp on 16.11.2017.
 */
public class ContainsClass {
    private List result;

    public List list1() {
        List list1 = new ArrayList<>(Arrays.asList(1, 4));
        List list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 6, 6));


        return result;
    }

    public static void main(String[] args) {
        List list1 = new ArrayList<>(Arrays.asList(1, 4));
        List list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 6, 6));
        List list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

        for (int i = 0; i < list3.size(); i++) {
            if (!list3.get(i).equals(list1)) {
                list1 = list3;
            }
        }

        System.out.println(list1);
    }
}
