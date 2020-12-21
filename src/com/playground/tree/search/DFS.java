package com.playground.tree.search;

import com.playground.Algorithm;
import com.playground.tree.model.BinaryTree;
import com.playground.tree.service.TreeService;

import java.util.Stack;

public class DFS implements Algorithm {

    @Override
    public void execute() {
        BinaryTree<Integer> head = TreeService.generateTree();

        Stack<BinaryTree<Integer>> nodesToVisit = new Stack<>();
        nodesToVisit.add(head);
        BinaryTree<Integer> guess = null;
        int search = 12;
        int nbPasses = 0;

        while (!nodesToVisit.isEmpty() && ++nbPasses < 50) {
            BinaryTree<Integer> current = nodesToVisit.pop();
            System.out.println(String.format("current: %s", current.describe()));

            if (current.getValue().equals(search)) {
                guess = current;
                nodesToVisit.clear();
                break;
            }

            if (current.hasRight()) {
                nodesToVisit.add(current.getRight());
            }

            if (current.hasLeft()) {
                nodesToVisit.add(current.getLeft());
            }
            System.out.println("stack: " + nodesToVisit.toString() + "\n");
        }

        System.out.println(String.format("guessed: %s", ((guess == null) ? "nothing" : guess.describe())));
    }

//    public BinaryTree<Integer> findNode(BinaryTree<Integer> node, Integer search) {
//        nbPasses++;
//
//        if(node.hasLeft()){
//            if(node.hasRight()){
//
//            }
//        }
//
//
//        return null;
//
//    }
}
