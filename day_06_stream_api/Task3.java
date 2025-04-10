// Task 3. Given a list of lists of integers. Your goal is to:
// 1. Flatten it into a single list.
// 2. Remove duplicate values.
// 3. Filter only numbers greater than 10.
// 4. Sort the final list in ascending order.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task3 {

    public static void main(String[] args) {
        List<List<Integer>> numLists = new ArrayList<>();
        numLists.add(Arrays.asList(43, 2, 34, 34));
        numLists.add(Arrays.asList(22, 3, 14, 15, 6));
        numLists.add(Arrays.asList(2, 3, 15, 7, 14));
        System.out.println("Original list: " + numLists);

        List<Integer> finalList = numLists.stream()
                .flatMap(List::stream)
                .distinct()
                .filter(a -> a > 10)
                .sorted()
                .toList();
        System.out.println("Final list: " + finalList);

    }
}

// Results:
// Original list: [[43, 2, 34, 34], [22, 3, 14, 15, 6], [2, 3, 15, 7, 14]]
// Final list: [14, 15, 22, 34, 43]
