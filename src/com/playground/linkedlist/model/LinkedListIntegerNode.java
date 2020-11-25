package com.playground.linkedlist.model;

public class LinkedListIntegerNode {
    private Integer value;
    private LinkedListIntegerNode next;

    public LinkedListIntegerNode(Integer value, LinkedListIntegerNode next) {
        this.value = value;
        this.next = next;
    }

    public LinkedListIntegerNode(Integer value) {
        this.value = value;
    }

    public boolean hasNext() {
        return next != null;
    }

    public LinkedListIntegerNode next() {
        return next;
    }

    public void setNext(LinkedListIntegerNode next) {
        this.next = next;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "LinkedListIntegerNode{" +
                "value=" + value +
                '}';
    }


}
