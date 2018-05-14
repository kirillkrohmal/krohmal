package ru.job4j.PendingOutput;

/**
 * Created by Comp on 25.10.2017.
 */
class CountWords implements Runnable {
    private String text;
    private int countWords;
    Thread current = Thread.currentThread();

    CountWords(String text) {
        this.text = text;
    }

    @Override
    public void run() {
        if (text.length() == 0) return;
        String[] words = text.split("");
        for (String o : words) {
            if (!o.equals(" ")) {
                ++countWords;
                System.out.println("Количество слов " + countWords);
                try {
                    Thread.sleep(3500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


