package ru.job4j.SimpleTreeTest;

import org.junit.Test;
import ru.job4j.SimpleTree.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

public class SimpleTreeTest {

    @Test
    public void iteratorTest() {
        List<Integer> expected = Arrays.asList(50, 60, 70, 10, 5, 80, 100, 150);
        List<Integer> result = new ArrayList<>();

        Tree<Integer> binaryTree = new Tree<>(50);

        binaryTree.add(50, 60);
        binaryTree.add(50, 70);
        binaryTree.add(60, 10);
        binaryTree.add(60, 5);
        binaryTree.add(60, 70);
        binaryTree.add(70, 80);
        binaryTree.add(70, 100);
        binaryTree.add(100, 150);
        binaryTree.add(100, 10);
        binaryTree.add(50, 150);
        binaryTree.add(100, 10);

        binaryTree.forEach(result::add);

        assertThat(result, containsInAnyOrder(expected.toArray()));
    }

    @Test
    public void iteratorTest2() {


    }
}
