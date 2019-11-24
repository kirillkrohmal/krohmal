package ru.job4j.countspace;


/**
 * Created by Comp on 25.10.2017.
 */
class CountSpaces implements Runnable {
    private String text;
    private int countSpaces = 0;
    private Thread thread = new Thread();

    CountSpaces(String text) {
        this.text = text;
    }

    @Override
    public void run() {
        thread.isInterrupted();
        if (text.length() == 0) {
            return;
        }
        for (char o : text.toCharArray()) {
            if (o == ' ') {
                ++countSpaces;
                System.out.println("Количество пробелов " + countSpaces);
                try {
                    Thread.sleep(3500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
