package com.playground.array;

import com.playground.Algorithm;

import java.util.Arrays;

public class RemoveDuplicateSortedArray implements Algorithm {
    @Override
    public void execute() {
        int[] items = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        System.out.println(String.format("Before: %s", Arrays.toString(items)));
        System.out.println(String.format("Length before: %s", items.length));
        System.out.println("-------------");
        System.out.println(String.format("Method returns: %s", Arrays.toString(removeDuplicates(items))));
        System.out.println(String.format("Length after: %s", items.length));
    }

    //  Constraints:
    // 0 <= nums.length <= 3 * 10^4
    //-10^4 <= nums[i] <= 10^4
    //nums is sorted in ascending order.
    public int[] removeDuplicates(int[] nums) {
        int previous = nums[0], current;

        for (int i = 1; i < nums.length - 1; i++) {
            current = nums[i];
            if (current != previous) {
                previous = current;
            } else {
                nums[i] = -100000;
            }
        }

        nums = Arrays.stream(nums).filter(value -> value != -100000).toArray();
        return nums;
    }
}
