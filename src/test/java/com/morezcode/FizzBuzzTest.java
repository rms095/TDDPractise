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

    @Test
    public void shouldProcessInput() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertThat("error in processing input 1", fizzBuzz.processNumber(1), is("1"));
        assertThat("error in processing input 2", fizzBuzz.processNumber(2), is("2"));
        assertThat("error in processing input 3", fizzBuzz.processNumber(3), is("Fizz"));
        assertThat("error in processing input 5", fizzBuzz.processNumber(5), is("Buzz"));
        assertThat("error in processing input 6", fizzBuzz.processNumber(6), is("Fizz"));
        assertThat("error in processing input 10", fizzBuzz.processNumber(10), is("Buzz"));
        assertThat("error in processing input 15", fizzBuzz.processNumber(15), is("FizzBuzz"));
        assertThat("error in processing input 30", fizzBuzz.processNumber(30), is("FizzBuzz"));
    }

    @Test
    public void shouldExecute() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(
                fizzBuzz.execute( new int[] { 1, 2, 3, 5, 6, 10, 15, 30 }),
                is("1, 2, Fizz, Buzz, Fizz, Buzz, FizzBuzz, FizzBuzz")
        );
    }
}
