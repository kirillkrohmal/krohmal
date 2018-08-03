package ru.job4j.ProducerConsumer;

import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Comp on 26.05.2018.
 */
@ThreadSafe
public class SimpleBlockingQueue<T> {
    @GuardedBy("this")
    private Queue<T> queue = new LinkedList<>();
    private int limit = 10;

    public SimpleBlockingQueue(int limit) {
        this.limit = limit;
    }

    /*
        добавляет элемент value в конец очереди. Если элемент удачно добавлен, возвращает true, иначе - false

        Вставляет указанный элемент в эту очередь, если возможно сделать так сразу, не нарушая ограничения емкости.
        При использовании ограниченной емкостью очереди этот метод обычно предпочтителен для add(E), который может
        быть не в состоянии вставить элемент только выдавая исключение.
    */
    boolean offer(T value) throws InterruptedException {
        while (this.queue.size() == this.limit) {
            wait();
        }

        if (this.queue.size() == 0) {
            notifyAll();

        }

        return this.queue.add(value);
    }

    /*
        Метод poll  - должен вернуть объект из внутренней коллекции. Если в коллекции объектов нет. то нужно перевести текущую нить в состояние ожидания.
        Важный момент, когда нить переводить в состояние ожидания. то она отпускает объект монитор и другая нить тоже может выполнить этот метод.
    */
    boolean poll() throws InterruptedException {
        while(this.queue.size() == 0) {
            wait();
        }

        if(this.queue.size() == this.limit){
            notifyAll();
        }

        return this.queue.remove(0);
    }
}

