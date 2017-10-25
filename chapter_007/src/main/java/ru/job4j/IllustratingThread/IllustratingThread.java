package ru.job4j.IllustratingThread;


/**
 * Создать пример иллюстрирующий проблемы, которые могут случиться при использовании многопоточности.
 */

public class IllustratingThread implements Runnable {
    Count count;
    Count2 count2;

    public IllustratingThread(Count count, Count2 count2) {
        this.count = count;
        this.count2 = count2;
    }

    public static void main(String[] args) {
        Count count = new Count();
        Count2 count2 = new Count2();

        new Thread(new IllustratingThread(count, count2)).start();

        new Thread(new IllustratingThread(count, count2)).start();
    }

    @Override
    public void run() {
        System.out.println(count.illustratingThread());
        System.out.println(count2.illustratingThread());
    }
}
