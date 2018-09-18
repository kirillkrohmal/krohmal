package ru.job4j.ParallerSearch2;

import ru.job4j.ProducerConsumer.SimpleBlockingQueue;

/**
 * Created by Comp on 17.08.2018.
 */
public class ParallerSearch2 {
    public static void main(String[] args) {
        SimpleBlockingQueue<Integer> queue = new SimpleBlockingQueue<>();
        final Thread consumer = new Thread(
                () -> {
                    while (true) {
                        try {
                            System.out.println(queue.dequeue());
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                            Thread.currentThread().interrupt();
                        }
                    }
                }
        );
        consumer.start();

        new Thread(
                () -> {
                    while (consumer.isInterrupted())
                            for (int index = 0; index != 3; index++) {
                                try {
                                    queue.enqueue(index);
                                    Thread.sleep(500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                    Thread.currentThread().interrupt();
                                }
                            }
                }
        ).start();
    }
}
