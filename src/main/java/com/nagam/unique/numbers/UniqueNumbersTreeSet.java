package com.nagam.unique.numbers;

import java.util.Set;
import java.util.TreeSet;

public class UniqueNumbersTreeSet {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 3, 5, 5, 6, 6};
        printUniqueNumbers(numbers);
    }

    public static void printUniqueNumbers(int[] numbers) {
        Set<Integer> uniqueNumbers = new TreeSet<>();
        Set<Integer> duplicates = new TreeSet<>();

        for (int number : numbers) {
            if (!uniqueNumbers.add(number)) {
                duplicates.add(number);
            }
        }

        uniqueNumbers.removeAll(duplicates);

        for (int unique : uniqueNumbers) {
            System.out.println(unique);
        }
    }
}
