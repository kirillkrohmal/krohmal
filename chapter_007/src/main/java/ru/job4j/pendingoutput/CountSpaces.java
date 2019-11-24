package ru.job4j.pendingoutput;

/**
 * Created by Comp on 25.10.2017.
 */
class CountSpaces implements Runnable {
    private String text;
    private int countSpaces;

    CountSpaces(String text) {
        this.text = text;
    }

    @Override
    public void run() {
        if (text.length() == 0) {
            return;
        }
        for (char o : text.toCharArray()) {
            if (o == ' ') {
                countSpaces++;
                System.out.println("Количество пробелов " + countSpaces);
                try {
                    Thread.sleep(3000);
                    Thread.interrupted();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
