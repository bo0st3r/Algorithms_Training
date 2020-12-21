package com.playground.tree.search;

import com.playground.Algorithm;
import com.playground.tree.model.BinaryTree;
import com.playground.tree.service.TreeService;

import java.util.LinkedList;
import java.util.Queue;

public class BFS implements Algorithm {
    @Override
    public void execute() {
        BinaryTree<Integer> head = TreeService.generateTree();

        Integer search = 23;
        int nbPasses = 0;

        Queue<BinaryTree<Integer>> nodesToVisit = new LinkedList<>();
        nodesToVisit.add(head);

        BinaryTree<Integer> guess = null;
        while (!nodesToVisit.isEmpty()) {
            nbPasses++;

            BinaryTree<Integer> current = nodesToVisit.poll();
            System.out.println("current: " + current.describe());

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
            System.out.println("queue: " + nodesToVisit.toString() + "\n");
        }

        System.out.println(String.format("passed by %s times", nbPasses));
        System.out.print("guess is: " + ((guess == null) ? "nothing" : guess.describe()));
    }
}
