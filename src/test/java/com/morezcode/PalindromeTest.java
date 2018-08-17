package com.morezcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeTest {
    
    private Palindrome palindrome = new Palindrome();

    @Test
    public void shouldReturnFalseIfInputStringIsEmpty() {
        assertFalse("Should return error if value is empty", palindrome.isPalindrome(""));
    }

    @Test
    public void shouldReturnFalseIfInputStringIsNull() {
        assertFalse("Should return error if input is null", palindrome.isPalindrome(null));
    }

    @Test
    public void shouldReturnTrueIfInputStringIsOnlySingleCharacter() {
        assertTrue("Single Character is always a palindrome", palindrome.isPalindrome("a"));
    }

    @Test
    public void shouldReturnTrueIfInputStringIsPalindromeButInCaseSensitive() {
        assertTrue("Word should be palindrome", palindrome.isPalindrome("Madam"));
    }

    @Test
    public void shouldReturnTrueIfInputStringIsPalindromeButCaseSensitive() {
        assertTrue("Word should be palindrome", palindrome.isPalindrome("MadAm"));
    }

    @Test
    public void shouldReturnFalseIfInputStringIsNotPalindrome() {
        assertFalse("Input is palindrome", palindrome.isPalindrome("Palindrome"));
    }
}
