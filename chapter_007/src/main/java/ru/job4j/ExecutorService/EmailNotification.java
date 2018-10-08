package ru.job4j.ExecutorService;

/**
 * Created by Comp on 27.07.2018.
 */
public class EmailNotification<E> {
    private Object body;
    private Object subject;

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

    public void send(String subject, String body, String email) {

    }
    public static void main(String[] args) {
        EmailNotification emailNotification = new EmailNotification();
        emailNotification.send("мое", "письмо", "десь");

    }
}
