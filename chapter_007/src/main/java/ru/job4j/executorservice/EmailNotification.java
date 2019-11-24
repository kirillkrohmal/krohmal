package ru.job4j.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Comp on 27.07.2018.
 */
public class EmailNotification<E> {
    ExecutorService pool = Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors());

    public void send(String subject, String body, String email) {

    }

    public void emailTo(User user) {
        pool.submit(()
                -> {
            String stringBuilder = "Subject = Notification"
                    + user.getUsername()
                    + " to email "
                    + user.getEmail()
                    + ".\nbody = Add a new event to "
                    + user.getUsername();

            send(user.getUsername(), stringBuilder, user.getEmail());
        });

    }
}
