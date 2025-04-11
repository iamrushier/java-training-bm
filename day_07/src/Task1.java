// Task 1. Create a program using a static method reference to check if numbers are even (Math::isEven).

import java.util.function.IntPredicate;

public class Task1 {
    public static void main(String[] args) {
        int num = 5;
        IntPredicate isEven = Math::isEven;
        System.out.println(num + " is even: " + isEven.test(num));
    }

    public static class Math {
        public static boolean isEven(int num) {
            return num % 2 == 0;
        }
    }
}

// Result
// 5 is even: false