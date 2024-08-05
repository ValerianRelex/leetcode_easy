package com.swvalerian.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void twoSum_case1(){
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = TwoSum.twoSum(nums, target);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }

    @Test
    void twoSum_case2(){
        int[] nums = {3, 2, 20, 4};
        int target = 6;
        int[] result = TwoSum.twoSum(nums, target);
        assertEquals(1, result[0]);
        assertEquals(3, result[1]);
    }

    @Test
    void twoSum_case3(){
        int[] nums = {3, 3};
        int target = 6;
        int[] result = TwoSum.twoSum(nums, target);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }

    @Test
    void twoSumFast_case4(){
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = TwoSum.twoSumFast(nums, target);
        assertEquals( 0, result[0]);
        assertEquals(1, result[1]);
    }

    @Test
    void twoSumFast_case5(){
        int[] nums = {3, 2, 20, 4};
        int target = 6;
        int[] result = TwoSum.twoSumFast(nums, target);
        assertEquals(1, result[0]);
        assertEquals(3, result[1]);
    }

    @Test
    void twoSumFast_case6(){
        int[] nums = {3, 7, 25, 44, 3};
        int target = 6;
        int[] result = TwoSum.twoSumFast(nums, target);
        assertEquals(0, result[0]);
        assertEquals(4, result[1]);
    }
}