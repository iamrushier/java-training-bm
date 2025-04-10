// Task 1. Find the longest string
// Given a list of string find the longest one using stream API

import java.util.Arrays;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {
        String[] arr = {"Ramesh", "Ravi", "AB", "Prathamesh", "Himanshu"};

        List<String> words = Arrays.asList(arr);

        System.out.println("Words: " + words);

        String longest = words.stream().reduce(words.get(0), (c, e) -> c.length() < e.length() ? e : c);

        System.out.println("Longest word: " + longest);
    }
}

// Result:
// Words: [Ramesh, Ravi, AB, Prathamesh, Himanshu]
// Longest word: Prathamesh
