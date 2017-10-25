package ru.job4j.CountSpace;



/**
 * Created by Comp on 25.10.2017.
 */
class CountSpaces implements Runnable {
    String text = null;
    int countSpaces = 0;
    Thread thread = new Thread();

    public CountSpaces(String text) {
        this.text = text;
    }

    @Override
    public void run() {
        thread.isInterrupted();
        if (text.length() == 0) return;
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
