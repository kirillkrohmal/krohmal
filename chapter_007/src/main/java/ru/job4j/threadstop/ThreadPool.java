package ru.job4j.threadstop;

/**
 * Created by Comp on 27.10.2017.
 */
public class ThreadPool {
    public static void main(String[] args) {
        CountChar countChar = new CountChar("Это что означает");
        Time time = new Time();

        new Thread() {
            @Override
            public void run() {
                countChar.run();
            }
        }.start();

        Thread.interrupted();
        time.run();
    }
}
