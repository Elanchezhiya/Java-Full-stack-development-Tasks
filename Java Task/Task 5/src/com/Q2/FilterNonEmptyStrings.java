package com.Q2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNonEmptyStrings {
    public static void main(String[] args) {
        // List of strings with some empty strings
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        // Filter out empty strings and collect non-empty strings into a new list
        List<String> nonEmptyStrings = strings.stream()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());

        // Print the list of non-empty strings
        System.out.println("Non-empty strings: " + nonEmptyStrings);
    }
}

