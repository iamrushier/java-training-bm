
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Task4 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        Predicate<Integer> isEven = num -> num % 2 == 0;

        System.out.println("Even numbers: ");
        numbers.stream().filter(isEven).forEach(System.out::println);

        Consumer<Integer> printElement = num -> System.out.println("Element: " + num);
        System.out.println("\nAll elements: ");
        numbers.forEach(printElement);

        List<String> words = Arrays.asList("Ramesh", "Suresh", "Mukesh", "John", "Abdul");
        Function<String, Integer> stringLength = str -> str.length();

        List<Integer> lengths = words.stream().map(stringLength).toList();

        System.out.print("\nStrings: ");
        System.out.println(words);
        System.out.print("String lengths: ");
        System.out.println(lengths);

    }
}

// Results:
// Even numbers: 
// 2
// 4
// 6
// 8
//
// All elements: 
// Element: 1
// Element: 2
// Element: 3
// Element: 4
// Element: 5
// Element: 6
// Element: 7
// Element: 8
//
// Strings: [Ramesh, Suresh, Mukesh, John, Abdul]
// String lengths: [6, 6, 6, 4, 5]
