package ru.job4j.Oracle_Tests.ocpjp2.question5;

public class Pooler extends Thread {

    public Pooler() {
    }

    public Pooler(Runnable r) {
        super(r);
    }

    public void run() {
        System.out.println("In Pooler");
    }

}
