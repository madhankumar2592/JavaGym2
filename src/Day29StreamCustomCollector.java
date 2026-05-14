package com.interview.daily;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Interview Question:
 * How do you create a custom collector in Java Streams?
 *
 * Explanation:
 * You can create a custom collector using `Collector.of()`.
 * It requires:
 * - A supplier: Creates a new result container.
 * - An accumulator: Incorporates an element into the result container.
 * - A combiner: Merges two result containers.
 * - A finisher: Transforms the final result container into the desired result.
 */

public class Day29StreamCustomCollector {

    /**
     * Problem Description:
     * Given a list of strings, concatenate them into a single string with a custom delimiter and prefix/suffix.
     *
     * Example:
     * Input: ["apple", "banana", "cherry"]
     * Output: "[apple, banana, cherry]"
     */

    public static String customJoin(List<String> list) {
        // TODO: Implement this method
        return "";
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList("apple", "banana", "cherry");
        String result = customJoin(input);

        System.out.println("Custom Join: " + result);

        // Expected Output:
        // Custom Join: [apple, banana, cherry]
    }
}

/*
// Solution Implementation

public static String customJoin(List<String> list) {
    return list.stream()
            .collect(Collector.of(
                    StringBuilder::new,
                    (sb, s) -> {
                        if (sb.length() > 0) sb.append(", ");
                        sb.append(s);
                    },
                    (sb1, sb2) -> {
                        if (sb1.length() > 0 && sb2.length() > 0) sb1.append(", ");
                        sb1.append(sb2);
                        return sb1;
                    },
                    sb -> "[" + sb.toString() + "]"
            ));
}
*/
