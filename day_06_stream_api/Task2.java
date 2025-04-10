// Task 2. Sort list in ascending/descending
// Sort a list of numbers in ascending and then descending order.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {
        Integer[] nums = {2, 4, 1, 54, 23, 45, 6, 3, 3};
        List<Integer> numbers = new ArrayList<>(Arrays.asList(nums));

        System.out.println("Unsorted: " + numbers);
        System.out.println("Sorted asc: " + numbers.stream().sorted((a, b) -> a.compareTo(b)).toList());
        System.out.println("Sorted desc: " + numbers.stream().sorted((a, b) -> b.compareTo(a)).toList());
    }
}

// Results
// Unsorted: [2, 4, 1, 54, 23, 45, 6, 3, 3]
// Sorted asc: [1, 2, 3, 3, 4, 6, 23, 45, 54]
// Sorted desc: [54, 45, 23, 6, 4, 3, 3, 2, 1]
