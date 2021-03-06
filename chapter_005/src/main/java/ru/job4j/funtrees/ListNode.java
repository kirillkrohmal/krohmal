package ru.job4j.funtrees;

public class ListNode {
    private int data;
    private ListNode next;

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }

    public ListNode(int data) {
        this(data, null);
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
