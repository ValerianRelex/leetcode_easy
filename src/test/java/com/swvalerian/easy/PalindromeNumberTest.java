package com.swvalerian.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {

    @Test
    void testPalindromeNumber_case1() {
        int number = 1490941;
        assertEquals(true, PalindromeNumber.isPalindrome(number));
    }

    @Test
    void testPalindromeNumber_case2() {
        int number = 149094;
        assertEquals(false, PalindromeNumber.isPalindrome(number));
    }

    @Test
    void testPalindromeNumber_case3() {
        int number = -1490941;
        assertEquals(false, PalindromeNumber.isPalindrome(number));
    }

    @Test
    void testPalindromeNumber_case4() {
        int number = 121;
        assertEquals(true, PalindromeNumber.isPalindrome(number));
    }

    @Test
    void testPalindromeNumber_case5() {
        int number = 1222;
        assertEquals(false, PalindromeNumber.isPalindrome(number));
    }

    @Test
    void testPalindromeNumber_case6() {
        int number = 12221;
        assertEquals(true, PalindromeNumber.isPalindrome(number));
    }

    @Test
    void testPalindromeNumber_case7() {
        int number = 12821;
        assertEquals(true, PalindromeNumber.isPalindrome(number));
    }
}