package ru.job4j.countspace;


/**
 * Created by Comp on 06.10.2017.
 */
public class CountThread extends Thread {
    public static void main(String[] args) throws Exception {
        CountSpaces countSpaces = new CountSpaces("Это что означает, что метод join(), срабатывает только в тех случаях, когда после него");
        CountWords countWords = new CountWords("Это что означает, что метод join(), срабатывает только в тех случаях, когда после него");

        new Thread() {
            @Override
            public void run() {
                countSpaces.run();
            }
        }.start();
        countWords.run();
    }
}



