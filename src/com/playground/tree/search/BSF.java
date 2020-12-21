package com.playground.tree.search;

import com.playground.Algorithm;
import com.playground.tree.model.BinaryTree;
import com.playground.tree.service.TreeService;

import java.util.PriorityQueue;
import java.util.Queue;

public class BSF implements Algorithm {
    @Override
    public void execute() {
        BinaryTree<Integer> head = TreeService.generateTree();

        Integer search = 18;
        int nbPasses = 0;

        Queue<BinaryTree<Integer>> nodesToVisit = new PriorityQueue<>();
        nodesToVisit.add(head);

        BinaryTree<Integer> guess = null;
        while (!nodesToVisit.isEmpty()) {
            nbPasses++;

            BinaryTree<Integer> current = nodesToVisit.poll();
            if (current.getValue().equals(search)) {
                guess = current;
                nodesToVisit.clear();
                break;
            }

            BinaryTree<Integer> left = current.getLeft();
            if (left != null) {
                nodesToVisit.add(left);
            }

            BinaryTree<Integer> right = current.getRight();
            if (right != null) {
                nodesToVisit.add(right);
            }
        }

        System.out.println(String.format("passed by %s times", nbPasses));
        System.out.print("guess is: " + ((guess == null) ? "nothing" : guess.describe()));
    }
}
