package com.swvalerian.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void twoSum_case1(){
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = TwoSum.twoSum(nums, target);
        assertEquals(result[0], 0);
        assertEquals(result[1], 1);
    }

    @Test
    void twoSum_case2(){
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] result = TwoSum.twoSum(nums, target);
        assertEquals(result[0], 1);
        assertEquals(result[1], 2);
    }

    @Test
    void twoSum_case3(){
        int[] nums = {3, 3};
        int target = 6;
        int[] result = TwoSum.twoSum(nums, target);
        assertEquals(result[0], 0);
        assertEquals(result[1], 1);
    }

    @Test
    void twoSumFast_case4(){
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = TwoSum.twoSumFast(nums, target);
        assertEquals(result[0], 0);
        assertEquals(result[1], 1);
    }

    @Test
    void twoSumFast_case5(){
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] result = TwoSum.twoSumFast(nums, target);
        assertEquals(result[0], 1);
        assertEquals(result[1], 2);
    }

    @Test
    void twoSumFast_case6(){
        int[] nums = {3, 3};
        int target = 6;
        int[] result = TwoSum.twoSumFast(nums, target);
        assertEquals(result[0], 0);
        assertEquals(result[1], 1);
    }
}