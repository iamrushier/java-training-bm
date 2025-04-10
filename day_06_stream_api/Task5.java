// Task 5. Exploring various functions in stream api
// List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve", "Bob", "Alice", "Frank");
// Consider above lists and perform –  
// • Convert all names to uppercase.
// • Count how many names start with the letter 'A'.
// • Group names by their length (e.g., names of length 3, 4, etc.).
// • Create a comma-separated string of all names.
// • Use peek() to print each name while processing.
// • Run any operation using parallel stream and show thread names via peek()

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task5 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve", "Bob", "Alice", "Frank");

        List<String> upperCaseNames = names.stream()
                .map(s -> s.toUpperCase())
                .toList();
        System.out.println("To uppercase: " + upperCaseNames);

        long countBeginWithA = upperCaseNames.stream()
                .filter(s -> s.startsWith("A"))
                .count();
        System.out.println("Number of words beginning with 'A': " + countBeginWithA);

        Map<Integer, List<String>> m = names.stream().collect(Collectors.groupingBy(w -> w.length()));
        System.out.println("Grouped by length: " + m);

        // String combined = names.stream().reduce("", (c, e) -> c + e + ", ");
        String combined = names.stream().collect(Collectors.joining(", "));
        System.out.println("Comma separetd list: " + combined);

        System.out.println("Peek at names: ");
        names.stream().peek(word -> System.out.println("  Processing: " + word)).toList();

        System.out.println("Using parallelStream() with peek():");
        names.parallelStream()
                .peek(name -> System.out.println("  " + Thread.currentThread().getName() + " - processing " + name))
                .toList();

    }
}

// Results:
// To uppercase: [ALICE, BOB, CHARLIE, DAVID, EVE, BOB, ALICE, FRANK]
// Number of words beginning with 'A': 2
// Grouped by length: {3=[Bob, Eve, Bob], 5=[Alice, David, Alice, Frank], 7=[Charlie]}
// Comma separetd list: Alice, Bob, Charlie, David, Eve, Bob, Alice, Frank
// Peek at names: 
//   Processing: Alice
//   Processing: Bob
//   Processing: Charlie
//   Processing: David
//   Processing: Eve
//   Processing: Bob
//   Processing: Alice
//   Processing: Frank
// Using parallelStream() with peek():
//   ForkJoinPool.commonPool-worker-4 - processing Bob
//   ForkJoinPool.commonPool-worker-7 - processing Alice
//   ForkJoinPool.commonPool-worker-2 - processing Bob
//   ForkJoinPool.commonPool-worker-3 - processing Charlie
//   ForkJoinPool.commonPool-worker-6 - processing Eve
//   main - processing Frank
//   ForkJoinPool.commonPool-worker-5 - processing Alice
//   ForkJoinPool.commonPool-worker-1 - processing David
