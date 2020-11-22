package com.playground.challenge;

import com.playground.Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HappyNumber implements Algorithm {
    private static final int MAX_ROUND = 5000;
    private int round = 0;

    @Override
    public void execute() {
        try {
            System.out.println(isHappy(35));
        } catch (StackOverflowError stackOverflowError) {
            System.out.println("false");
        }
    }

    public boolean isHappy(long n) {
        String nAsString = String.valueOf(n);
        List<Long> digits = new ArrayList<>();
        round++;

        Arrays.stream(nAsString.split("")).forEach(digitString -> {
            Long digitLong = Long.parseLong(digitString);
            digits.add(digitLong);
        });

        long sumOfDigitsSquared = digits.stream().reduce(0l, (sum, digit) -> sum + (long) Math.pow(digit, 2));
        boolean isOne = sumOfDigitsSquared == 1;

        System.out.println("Round " + round + ", sumOfDigitsSquared: " + sumOfDigitsSquared);

        if (isOne)
            return true;

        if (round >= MAX_ROUND)
            return false;

        return isHappy(sumOfDigitsSquared);
    }
}
