package com.playground.tree.service;

import com.playground.tree.model.BinaryTree;

public class TreeService {
    public static BinaryTree<Integer> generateTree() {
        BinaryTree<Integer> head = new BinaryTree<>(1);
        BinaryTree<Integer> t2 = new BinaryTree<>(2);
        BinaryTree<Integer> t3 = new BinaryTree<>(3);
        head.setLeft(t2);
        head.setRight(t3);

        BinaryTree<Integer> t4 = new BinaryTree<>(4);
        BinaryTree<Integer> t5 = new BinaryTree<>(5);
        t2.setLeft(t4);
        t2.setRight(t5);

        BinaryTree<Integer> t6 = new BinaryTree<>(6);
        BinaryTree<Integer> t7 = new BinaryTree<>(7);
        t3.setLeft(t6);
        t3.setRight(t7);

        BinaryTree<Integer> t8 = new BinaryTree<>(8);
        BinaryTree<Integer> t9 = new BinaryTree<>(9);
        t4.setLeft(t8);
        t4.setRight(t9);

        BinaryTree<Integer> t10 = new BinaryTree<>(10);
        t5.setLeft(t10);

        BinaryTree<Integer> t12 = new BinaryTree<>(12);
        t6.setRight(t12);

        BinaryTree<Integer> t13 = new BinaryTree<>(13);
        t7.setLeft(t13);

        BinaryTree<Integer> t23 = new BinaryTree<>(23);
        BinaryTree<Integer> t24 = new BinaryTree<>(24);
        t12.setLeft(t23);
        t12.setRight(t24);

        return head;
    }
}
