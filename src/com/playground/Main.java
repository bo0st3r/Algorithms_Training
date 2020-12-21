package com.playground;

import com.playground.tree.search.BFS;

import java.time.Duration;
import java.time.Instant;

public class Main {
    public static void main(String[] args) {
        // Change instantiation here
        Algorithm challenge = new BFS();
        // Change instantiation here

        Instant before = Instant.now();
        challenge.execute();

        Instant after = Instant.now();
        Duration duration = Duration.between(before, after);
        printBar();
        System.out.println("Challenge: " + challenge.getClass().getSimpleName());
        System.out.println("Duration in nanoseconds: " + duration.getNano());
    }

    public static void printBar(){
        System.out.println("\n-------------------");
    }
}


