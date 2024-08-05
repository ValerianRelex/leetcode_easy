package com.swvalerian.easy;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        String sourceString = String.valueOf(x);
        String rightSubstring = sourceString.substring(sourceString.length() / 2);
        String leftSubstring = sourceString.substring(0, sourceString.length() / 2);

        if (sourceString.length() % 2 != 0) {
            rightSubstring = sourceString.substring(1 + (sourceString.length() / 2));
            leftSubstring = sourceString.substring(0, sourceString.length() / 2);
        }

        int index = rightSubstring.length() - 1;

        for (int i = 0; i < leftSubstring.length(); i++) {
            if (leftSubstring.charAt(i) != rightSubstring.charAt(index)) {
                return false;
            }
            --index;
        }

        return true;
    }
}
