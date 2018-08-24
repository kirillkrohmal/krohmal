package ru.job4j.LockMechanizm;

/**
 * Created by Comp on 23.11.2017.
 */
public class LockMechanizm {
    private final Object lock = new Object();
    private boolean blockIt = true;

    private void lock() throws InterruptedException {
        synchronized (lock) {
            System.out.println("lock");
            if (this.blockIt) {
                lock.wait();
            }
            System.out.println("usefull work");
        }
    }

    private boolean unlock(boolean b) {
        synchronized (lock) {
            System.out.println("unlock");
            if (this.blockIt) {
                lock.notify();
            }
        }
        return false;
    }

    public static void main(String[] args) {
        LockMechanizm lockMechanizm = new LockMechanizm();

        new Thread () {
            @Override
            public void run() {
                try {
                    lockMechanizm.lock();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();

        new Thread () {
            @Override
            public void run() {
                lockMechanizm.unlock(true);
            }
        }.start();
    }
}

