package com.morezcode;

import java.util.Objects;

public class Palindrome {

    public boolean isPalindrome(String inputString) {
        if (Objects.nonNull(inputString)) {
            if (inputString.length() == 0)
                return false;
            else {
                return inputString.length() == 1 || checkEqualityWithIgnoreCaseByReversingInputString(inputString);
            }
        }
        return false;
    }

    private boolean checkEqualityWithIgnoreCaseByReversingInputString(String inputString) {
        return reverseString(inputString).equalsIgnoreCase(inputString);
    }

    private String reverseString(String inputString) {
        return new StringBuilder(inputString).reverse().toString();
    }
}
