package ru.job4j.ThreadStop;

/**
 * Created by Comp on 06.10.2017.
 */
public class CountChar implements Runnable {
    private int countChar = 0;
    private String ch;

    public CountChar(String ch) {
        this.ch = ch;
    }

    @Override
    public void run() {
        if (ch.length() == 0) return;

        char[] count = ch.toCharArray();
        for (char c1 : count) {
            if (c1 != ' ') {
                countChar++;
                System.out.println("Количество символов " + countChar);
            }
            try {
                Thread.sleep(2300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

