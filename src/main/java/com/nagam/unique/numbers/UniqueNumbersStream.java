package com.nagam.unique.numbers;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniqueNumbersStream {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 3, 5, 5, 6, 6};
        printUniqueNumbers(numbers);
    }

    public static void printUniqueNumbers(int[] numbers) {
        Arrays.stream(numbers)
              .boxed()
              .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
              .entrySet()
              .stream()
              .filter(entry -> entry.getValue() == 1)
              .forEach(entry -> System.out.println(entry.getKey()));
    }
}
