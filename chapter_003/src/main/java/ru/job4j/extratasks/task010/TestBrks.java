package ru.job4j.extratasks.task010;

/**
 * Реализовать методы проверки корректности открытых и закрытых скобок. Например,
 * ()(()((()))) - true, ()) - false
 * не будет работать. Тебе просто нужно посчитать количество символов - ")" и "(" если они равны то true, иначе false.
 */
public class TestBrks {
    public boolean braketsChoice(String[] brakets, String[] brkts, String[] brkts2) {
        boolean isChoice = false;
        int uniq = brakets.length;
        int count = 0;
        int count2 = 0;

        for (int i = 0; i < uniq; i++) {
            for (int j = 0; j < uniq; j++) {
                if (brakets[i].equals(brkts[j])) {
                    count++;
                    break;
                } else if (brakets[i].equals(brkts2[j])) {
                    count2++;
                    break;
                }
            }

        }

        if (count == count2) {
            isChoice = true;
        } else {
            isChoice = false;
        }
        return isChoice;
    }
}
