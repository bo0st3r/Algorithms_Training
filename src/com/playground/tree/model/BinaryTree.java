package com.playground.tree.model;

public class BinaryTree<T> implements Comparable<T> {
    private T value;
    private BinaryTree<T> left;
    private BinaryTree<T> right;

    public BinaryTree(T value) {
        this.value = value;
    }

    public String describe() {
        T leftValue = hasLeft() ? left.value : null;
        T rightValue = hasRight() ? right.value : null;
        return String.format("value: %s, left: %s, right: %s", value, leftValue, rightValue);
    }

    public boolean hasLeft() {
        return left != null;
    }

    public boolean hasRight() {
        return right != null;
    }

    public boolean hasChild() {
        return left != null || right != null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public BinaryTree<T> getLeft() {
        return left;
    }

    public void setLeft(BinaryTree<T> left) {
        this.left = left;
    }

    public BinaryTree<T> getRight() {
        return right;
    }

    public void setRight(BinaryTree<T> right) {
        this.right = right;
    }

    @Override
    public int compareTo(T o) {
        return 0;
    }
}
