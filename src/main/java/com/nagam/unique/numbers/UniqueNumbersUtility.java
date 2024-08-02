package com.nagam.unique.numbers;

import java.util.HashSet;
import java.util.Set;

public class UniqueNumbersUtility {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 3, 5, 5, 6, 6};
        UniqueNumberUtils.printUniqueNumbers(numbers);
    }
}

class UniqueNumberUtils {
    public static void printUniqueNumbers(int[] numbers) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

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
