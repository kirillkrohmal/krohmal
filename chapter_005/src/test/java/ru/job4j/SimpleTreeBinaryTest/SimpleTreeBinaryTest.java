package ru.job4j.SimpleTreeBinaryTest;

public class SimpleTreeBinaryTest<E> {

    private final int sixteen = 16;
    private final int ten = 10;

/*    @Test
    public void whenCheckForBinaryTreeThenReturnResult() {
        BinaryTree<Integer> underTest = new BinaryTree<>(new Node<>(sixteen));
        for (int i = 0; i < sixteen * 2; i++) {
            underTest.add(i);
        }

        Node<Integer> result = underTest.searchByValue(ten);
        assertThat(result.getValue(), is(ten));

    }

    private final int three = 3;
    private final int four = 4;
    private final int five = 5;
    private final int six = 6;
    private final int seven = 7;

    *//**
     * Test for DFS method.
     *//*
    @Test
    public void whenInvertTreeDfsThenReturnResult() {
        SearchBinaryTree<Integer> underTest = new SearchBinaryTree<>(new BinaryNode<>(four));
        underTest.add(2);
        underTest.add(six);
        underTest.add(1);
        underTest.add(three);
        underTest.add(five);
        underTest.add(seven);

        TreeInverter<Integer> treeInverter = new TreeInverter<>(underTest);
        treeInverter.invertTreeDfs(underTest.getRoot());

        int[] results = {underTest.getRoot().getLeftChild().getValue(), underTest.getRoot().getRightChild().getValue()};
        int[] expected = {six, 2};
        assertThat(results, is(expected));

    }*/

}
