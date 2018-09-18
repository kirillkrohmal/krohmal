package ru.job4j.ExecutorService;

import ru.job4j.DynamicListThread.LinkedListContainer.Node;

import java.util.concurrent.Executors;

/**
 * Created by Comp on 27.07.2018.
 */
public class EmailNotification<E> {
    private Object body;
    private Object subject;

    ExecutorService service = (ExecutorService) Executors.newFixedThreadPool(3);

    private Node<E> head;

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }

    public Object getSubject() {
        return subject;
    }

    public void setSubject(Object subject) {
        this.subject = subject;
    }

    void emailTo(User user) {

        body = user.getUsername();
    }

    public void send(String subject, String body, String email) {

    }
}
