package com.playground.search;

import com.playground.Algorithm;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch implements Algorithm {

    @Override
    public void execute() {
        List<Integer> items = new ArrayList<>();
        int size = 500000;
        final int toFind = 489000;

        for (int i = 0; i < size; i++) {
            items.add(i);
        }

        System.out.println(String.format("Search %s, should be right. \nResult: %s", toFind, search(items, toFind)));
        System.out.println(String.format("Search %s, should be right. \nResult: %s", 15, search(items, 15)));
        System.out.println(String.format("Search %s, should be right. \nResult: %s", 125000, search(items, 125000)));
        System.out.println(String.format("Search %s, should be right. \nResult: %s", 125001, search(items, 125001)));
        System.out.println(String.format("Search %s, should be right. \nResult: %s", 375000, search(items, 375000)));
        System.out.println(String.format("Search %s, should be right. \nResult: %s", 375001, search(items, 375001)));
        System.out.println(String.format("Search %s, shouldn't find. \nResult: %s", -5, search(items, -5)));
        System.out.println(String.format("Search %s, shouldn't find. \nResult: %s", size + 1, search(items, size + 1)));
        System.out.println(String.format("Search %s, shouldn't find. \nResult: %s", size + 100000, search(items, size + 100000)));
    }

    public Integer search(List<Integer> toSearch, Integer toFind) {
        System.out.println("----------------------");
        int min = 0;
        int max = toSearch.size() - 1;
        if (toSearch.get(max) < toFind || toSearch.get(min) > toFind)
            return -1;

        int mid = 0, guess = 0, nbRounds = 0;
        while (guess != toFind && min >= 0 && max >= 0) {
            nbRounds++;
            mid = Math.floorDiv(min + max, 2);
            guess = toSearch.get(mid);

            if (guess > toFind)
                max = mid - 1;
            else if (guess < toFind)
                min = mid + 1;
        }

        System.out.println("toFind: " + toFind + ", guess: " + guess + ", nbRounds: " + nbRounds);
        if (guess != toFind)
            return -1;

        return guess;
    }
}
