package ru.job4j.NodeTest;

import org.junit.Test;
import ru.job4j.LinkedListContainer.LinkedListContainer;
import ru.job4j.Node.Node;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 23.10.2017.
 */
public class NodeTest {
    Node node;

    @Test
    public void iteratorTest() {
        node = new Node(1);
        Node first = new Node(1);
        //Node two = new Node(1);
        boolean result = node.hasCycle(first);
        assertThat(result, is(true));
    }

    @Test
    public void iteratorTest2() {
        node = new Node(2);
        Node first = new Node(2);
        boolean result = node.hasCycle(first);
        assertThat(result, is(true));
    }
}
