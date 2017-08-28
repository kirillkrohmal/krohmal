package ru.job4j.ExtraTasks.task_009;

import java.util.Arrays;

/**
 * Реализовать метод подсчета уникальных символов в строке.
 */
public class CountChr {
   public boolean countIt(char[] array) {
       boolean choice = false;

       int uniq = array.length;

       for (int i = 0; i < uniq + 1; i++) {
           for (int j = 0; j < uniq + 1; j++) {
               if (array[i] != array[j + 1]) {
                   uniq--;
                   choice = true;
               } else {
                   choice = false;
               }
           }
       }
        /*for (int i = 0; i < uniq; i++) {
            for (int j = i + 1; j < uniq; j++) {
                if (array[i] != array[j]) {
                    j--;
                    uniq--;
                    choice = true;
                }
            }
        }*/
        return choice;
    }
}
