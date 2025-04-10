
// Task 4. Given a list of strings. You need to:
// 1. Split all sentences into words.
// 2. Count how many times each word appears.
// 3. Use parallel stream to improve performance on large datasets.
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task4 {

    public static void main(String[] args) {
        List<String> sentences = Arrays.asList("India is a country", "I watch cricket", "India loves Cricket");
        Map<String, Long> wordCounts = sentences.parallelStream()
                .flatMap(s -> Arrays.stream(s.split(" ")))
                .collect(Collectors.groupingBy(word -> word.toLowerCase(), Collectors.counting()));
        System.out.println(wordCounts);
    }
}

// Result
// {country=1, a=1, watch=1, cricket=2, loves=1, i=1, is=1, india=2}
