package com.swvalerian.easy;

import java.util.*;

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

        Map<Integer, Integer> map = new HashMap<>();

        int firstIndex = 0;
        int secondIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                // 2 7 11 15 target = 9
                firstIndex = map.get(target - nums[i]);
                secondIndex = i;
                return new int[] { firstIndex, secondIndex };
            }
            map.put(nums[i], i);
        }
        return new int[] { -1000, -1000 };
    }
}
