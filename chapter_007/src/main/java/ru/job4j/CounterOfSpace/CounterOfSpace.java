package ru.job4j.CounterOfSpace;

/**
 * Created by Comp on 24.07.2018.
 */
public class CounterOfSpace {
    private int counterOfSpaces;
    private int counterOfWords;
    private String text;
    private Thread thread01;
    private Thread thread02;

    public CounterOfSpace(String text) {
        this.text = text;
    }

    void startAll() {
        System.out.println("Start program");

        calcWords();
        calcSpaces();

        thread01.start();
        thread02.start();
        try {
            thread01.join();
            thread02.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Finish program");
    }

    private void calcSpaces() {
        thread01 = new Thread(new Runnable() {
            @Override
            public void run() {
                if (text.length() == 0) return;
                for (char c : text.toCharArray()) {
                    if (c == ' ') {
                        counterOfSpaces++;
                        System.out.println("counterOfSpaces " + counterOfSpaces);
                    }
                }
            }
        });
    }

    private void calcWords() {
        thread02 = new Thread(new Runnable() {
            @Override
            public void run() {
                if (text.length() == 0) return;
                String[] words = text.split(" ");
                for (String word : words) {
                    if (!word.equals(" ")) {
                        counterOfWords++;
                        System.out.println("counterOfWords " + counterOfWords);
                    }
                }
            }
        });
    }
}

