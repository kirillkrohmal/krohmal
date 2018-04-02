package ru.job4j.FunTrees;

/**
 * Created by Comp on 31.03.2018.
 */

public class TreeNode {
    public TreeNode left;
    public TreeNode right;
    public ListNode value;

    public TreeNode(ListNode value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public TreeNode(ListNode value) {
        this(value, null, null);
    }
}

