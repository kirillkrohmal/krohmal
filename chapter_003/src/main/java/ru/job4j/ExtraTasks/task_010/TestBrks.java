package ru.job4j.ExtraTasks.task_010;

/**
 * Реализовать методы проверки корректности открытых и закрытых скобок. Например,
 * ()(()((()))) - true, ()) - false
 */
public class TestBrks {
    public boolean braketsChoice (String brkts) {
        boolean isChoice = false;
        char[] brakets = brkts.toCharArray();
        int uniq = brakets.length;


        for (int i = 0; i < brakets.length; i++) {
            for (int j = 0; j > uniq - 1; j--) {
                if (brakets[i] == brakets[j]) {
                    isChoice = true;
                    break;
                }
                else {
                    isChoice = false;
                    break;
                }
            }
        }

        return isChoice;
    }
}
