package ru.job4j.ProducerConsumer;

import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Comp on 26.05.2018.
 */

@ThreadSafe
public class SimpleBlockingQueue<T> {
    @GuardedBy("this")
    private Queue<T> queue = new LinkedList<>();
    int limit = 10;
    private ReentrantLock lock;
    private Thread leader = null;
    private final Condition available = lock.newCondition();

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
        final ReentrantLock lock = this.lock;
        lock.lock();
        try {
            if (queue.peek() == value) {
                leader = null;
                available.signal();
            }
            return true;
        } finally {
            lock.unlock();
        }
    }

    /*
        Метод poll  - должен вернуть объект из внутренней коллекции. Если в коллекции объектов нет. то нужно перевести текущую нить в состояние ожидания.
        Важный момент, когда нить переводить в состояние ожидания. то она отпускает объект монитор и другая нить тоже может выполнить этот метод.
    */
    T poll() throws InterruptedException {
        final ReentrantLock lock = this.lock;
        lock.lock();
        try {
            Object first = queue.peek();
            if (first == null)
                return null;
            else
                return queue.poll();
        } finally {
            lock.unlock();
        }
    }
}


