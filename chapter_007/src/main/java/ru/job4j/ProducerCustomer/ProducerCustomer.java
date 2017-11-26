package ru.job4j.ProducerCustomer;



/**
 * Created by Comp on 23.11.2017.
 */
public class ProducerCustomer implements Runnable {
    private volatile boolean isPresent = false;

    private final Object lock = new Object();
    private boolean condition = true;


    public void doBlock () {
        synchronized(lock) {
            this.isPresent = true;
        }
    }

    public void changeBlock () {
        //if (doBlock() == false) {

    }


    public static void main(String[] args) {

    }

    @Override
    public void run() {

    }
}
