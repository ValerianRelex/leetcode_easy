package com.swvalerian.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }

    public static int[] twoSumFast(int[] nums, int target) {

        Set<Integer> set = new HashSet<>();

        int firstIndex = 0;
        int secondIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(target - nums[i])) {
                // 2 7 11 15 target = 9
                firstIndex = i;
                secondIndex = Arrays.toString(nums).indexOf(target - nums[i]);
            }
        }
        return new int[] { firstIndex, secondIndex };
    }
}
