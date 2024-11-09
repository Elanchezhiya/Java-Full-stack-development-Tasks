package com.Q1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UpperCaseConverter {
    public static void main(String[] args) {
        // Initialize the stream with given strings
        Stream<String> names = Stream.of("aBc", "d", "ef");

        // Use map() to convert each string to uppercase, then collect into a list
        List<String> upperCaseNames = names
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        // Display the result
        System.out.println("Uppercase names: " + upperCaseNames);
    }
}

