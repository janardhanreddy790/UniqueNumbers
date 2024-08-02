# UniqueNumbers
prints unique numbers from an array of integer values


### Approach 1: Traditional Looping with Sets
- Uses HashSet to store unique numbers and a set for duplicates.
- Iterates through the array twice (once to find duplicates and once to print unique values).
- This is a straightforward method using basic Java collections.

### Approach 2: Using Streams (Java 8 and Above)
- Uses Java Streams to process the array.
- Converts the array to a stream, groups by number, counts occurrences, and filters out non-unique values.
- This approach is more declarative and leverages the power of Java 8 streams for concise and readable code.

### Approach 3: Using a Separate Utility Class
- Similar to Approach 1 but encapsulates the logic in a separate utility class.
- Promotes code reuse and separation of concerns.

### Approach 4: Using LinkedHashSet to Maintain Order
- Uses LinkedHashSet to maintain the insertion order of unique elements.
- Useful if the order of the original array needs to be preserved.

### Approach 5: Using TreeSet to Sort Output
- Uses TreeSet to store unique numbers in a sorted order.
- Ideal if the output needs to be sorted.


### Efficiency and Performance Comparison
Let's analyze the performance aspects of each approach:

1. ***Traditional Looping with Sets***
    - ***Time Complexity***: O(n), where n is the number of elements in the array. The HashSet operations (add and remove) are average O(1).
    - ***Space Complexity***: O(n), due to the storage of elements in sets.


2. ***Using Streams (Java 8 and Above)***
   - ***Time Complexity***: O(n) for converting the array to a stream, O(n) for grouping and counting, and O(n) for filtering.
   - Space Complexity***: O(n), due to intermediate collections created by the stream operations.
   - ***Performance***: Slightly slower due to the overhead of stream operations and lambda expressions.


3. ***Using a Separate Utility Class***
   - ***Time Complexity***: Similar to Approach 1, O(n).
   - ***Space Complexity***: O(n).
   - ***Performance***: Similar to Approach 1, as it uses the same logic.


4. ***Using LinkedHashSet to Maintain Order***
   - ***Time Complexity***: O(n).
   - ***Space Complexity***: O(n).
   - ***Performance***: Similar to Approach 1, with additional benefits of maintaining insertion order.


5. ***Using TreeSet to Sort Output***
   - ***Time Complexity***: O(n log n), due to the sorting nature of TreeSet.
   - ***Space Complexity***: O(n).
   - ***Performance***: Slower than HashSet due to sorting, but beneficial if sorted order is required.


### Performance Comparison Summary
1. Fastest Approaches: Traditional Looping with Sets and Using a Separate Utility Class (Approaches 1 and 3) due to O(1) average time complexity for HashSet operations.
2. Slightly Slower: Using Streams and LinkedHashSet (Approaches 2 and 4) due to overhead of stream operations and maintaining order.
3. Slower but Sorted: Using TreeSet (Approach 5) due to O(n log n) time complexity.
4. Convenience with External Library: Apache Commons Collections (Approach 6) offers ease of use with comparable performance to traditional methods.

### Conclusion
1. For maximum performance, use Approach 1 or Approach 3.
2. For readable and concise code with Java 8 features, use Approach 2.
3. To maintain insertion order, use Approach 4.
4. For sorted output, use Approach 5.