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
    /*
        private Node<T> head;
        private Node<T> tail;
    */
    private int size;
    /*
        добавляет элемент value в конец очереди. Если элемент удачно добавлен, возвращает true, иначе - false

        Вставляет указанный элемент в эту очередь, если возможно сделать так сразу, не нарушая ограничения емкости.
        При использовании ограниченной емкостью очереди этот метод обычно предпочтителен для add(E), который может
        быть не в состоянии вставить элемент только выдавая исключение.
    */
    public boolean offer(T value) {
        //Node<T> node = new Node<T>(value);

        if (value == null) {

        } else {

        }

        size++;
        return false;
    }

    /*
        Метод poll  - должен вернуть объект из внутренней коллекции. Если в коллекции объектов нет. то нужно перевести текущую нить в состояние ожидания.
        Важный момент, когда нить переводить в состояние ожидания. то она отпускает объект монитор и другая нить тоже может выполнить этот метод.
    */
    public T poll() {
        if (size == 0) {
            return null;
        }


        size--;
        return obj;
    }
}

