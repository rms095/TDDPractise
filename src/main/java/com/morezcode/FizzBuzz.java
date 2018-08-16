package com.morezcode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FizzBuzz {
    public String execute(int [] numbers) {
        return Arrays.stream(numbers)
                .mapToObj(this::processNumber)
                .collect(Collectors.joining(", "));
    }

    public String processNumber(int number) {
        if( isMultipleOfThree(number) && isMultipleOfFive(number))
            return "FizzBuzz";
        if( isMultipleOfThree(number) )
            return "Fizz";
        if( isMultipleOfFive(number) )
            return "Buzz";
        return String.valueOf(number);
    }

    private boolean isMultipleOfFive(int number) {
        return number % 5 == 0;
    }

    private boolean isMultipleOfThree(int number) {
        return number % 3 == 0;
    }
}
