package com.morezcode;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/*
[1, 2, 3, 5, 6, 10, 15, 30]
["1, 2, Fizz, Buzz, Fizz, Buzz, FizzBuzz, FizzBuzz"]
reference - https://learnitmyway.com/tdd-example/
 */

public class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void shouldReturnSameNumberIfNumberIsNotMultipleOfAnything() {
        assertThat("error in processing input 1", fizzBuzz.processNumber(1), is("1"));
        assertThat("error in processing input 2", fizzBuzz.processNumber(2), is("2"));
        assertThat("error in processing input 2", fizzBuzz.processNumber(7), is("7"));
        assertThat("error in processing input 2", fizzBuzz.processNumber(8), is("8"));

        assertThat("error in processing input 5", fizzBuzz.processNumber(-71), is("-71"));
    }

    @Test
    public void shouldReturnFizzIfNumberIsMultipleOfThree() {
        assertThat("error in processing input 3", fizzBuzz.processNumber(3), is("Fizz"));
        assertThat("error in processing input 6", fizzBuzz.processNumber(6), is("Fizz"));
        assertThat("error in processing input 9", fizzBuzz.processNumber(9), is("Fizz"));
        assertThat("error in processing input 15", fizzBuzz.processNumber(15), is("FizzBuzz"));
        assertThat("error in processing input 9", fizzBuzz.processNumber(141), is("Fizz"));

        assertThat("error in processing input -9", fizzBuzz.processNumber(-9), is("Fizz"));
    }

    @Test
    public void shouldReturnBuzzIfNumberIsMultipleOfFive() {
        assertThat("error in processing input 5", fizzBuzz.processNumber(5), is("Buzz"));
        assertThat("error in processing input 10", fizzBuzz.processNumber(10), is("Buzz"));
        assertThat("error in processing input 15", fizzBuzz.processNumber(15), is("FizzBuzz"));
        assertThat("error in processing input 10", fizzBuzz.processNumber(700), is("Buzz"));

        assertThat("error in processing input -10", fizzBuzz.processNumber(-10), is("Buzz"));
    }

    @Test
    public void shouldReturnFizzBuzzIfNumberIsMultipleOfFifteen() {
        assertThat("error in processing input 15", fizzBuzz.processNumber(15), is("FizzBuzz"));
        assertThat("error in processing input 30", fizzBuzz.processNumber(30), is("FizzBuzz"));
        assertThat("error in processing input 750", fizzBuzz.processNumber(750), is("FizzBuzz"));

        assertThat("error in processing input -15", fizzBuzz.processNumber(-15), is("FizzBuzz"));
    }

    @Test
    public void shouldReturnCompleteStringIfIntegerArrayPassed() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(
                fizzBuzz.execute( new int[] { 1, 2, 3, 5, 6, 10, 15, 30 }),
                is("1, 2, Fizz, Buzz, Fizz, Buzz, FizzBuzz, FizzBuzz")
        );
    }
}
