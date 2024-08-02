package com.nagam.unique.numbers;

import java.util.HashSet;
import java.util.Set;

public class UniqueNumbersTraditional {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 3, 5, 5, 6, 6};
        printUniqueNumbers(numbers);
    }

    public static void printUniqueNumbers(int[] numbers) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        // Identify unique and duplicate numbers
        for (int number : numbers) {
            if (!uniqueNumbers.add(number)) {
                duplicates.add(number);
            }
        }

        // Remove duplicates from the set of unique numbers
        uniqueNumbers.removeAll(duplicates);

        // Print unique numbers
        for (int unique : uniqueNumbers) {
            System.out.println(unique);
        }
    }
}
