package ru.job4j.PendingOutput;

/**
 * Created by Comp on 25.10.2017.
 */
class CountSpaces implements Runnable {
    String text = null;
    int countSpaces;

    public CountSpaces(String text) {
        this.text = text;
    }

    @Override
    public void run() {
        if (text.length() == 0) return;
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
