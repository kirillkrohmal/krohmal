package ru.job4j.NodeTest;

import org.junit.Test;
import ru.job4j.Node.Node;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 23.10.2017.
 */
public class NodeTest {
    Node node;
    private final int three = 3;
    private final int four = 4;

    @Test
    public void iteratorTest3() {
        Node<Integer> first = new Node<>(1);
        Node<Integer> two = new Node<>(2);
        Node<Integer> third = new Node<>(three);
        Node<Integer> forth  = new Node<>(four);

        first.setNext(two);
        two.setNext(third);
        third.setNext(forth);
        forth.setNext(first);

        boolean result = node.hasCycle(first);
        assertThat(result, is(true));
    }
}
