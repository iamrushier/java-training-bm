
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MainOld {

    //1. Write a Java program to reverse an integer. (Example: Input 1234, Output 4321).
    public static int reverseNumber(int number) {
        int reversed;
        String sign = "";
        StringBuilder b;

        String a = String.valueOf(number);
        if (a.startsWith("-")) {
            sign = "-";
            a = a.replace("-", "");
        }
        b = new StringBuilder(a).reverse().insert(0, sign);
        reversed = Integer.parseInt(b.toString());
        return reversed;
    }

    //2. Determine whether a given number or string is a palindrome (Example: 121, madam).
    public static boolean isPalindrome(String string) {
        String strReverse = new StringBuilder(string).reverse().toString();
        return string.equals(strReverse);
    }

    //3. Implement a method to calculate the factorial of a given number using both recursion and iteration.
    public static int factorialRecursion(int num) {
        if (num <= 1) {
            return 1;
        }
        return num * factorialRecursion(num - 1);
    }

    public static int factorialIteration(int num) {
        int fact = 1;

        while (num > 1) {
            fact *= num;
            num--;
        }
        return fact;
    }

    //4. Print the first n terms of the Fibonacci series without using recursion.
    public static void printFibonacci(int n) {
        int a = 0;
        int b = 1;
        System.out.printf("First %d fibonacci numbers: ", n);
        for (int i = 1; i <= n; i++) {
            System.out.print(a + ", ");
            int temp = a;
            a = b;
            b += temp;
        }
        System.out.println();
    }

    //5. Compute the sum of the digits of a given number (Example: 123 → 1+2+3 = 6).
    public static int getDigitSum(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    //6. Given an array, find the largest and smallest numbers without sorting.
    public static void findMaxMin(int[] arr) {
        int max = arr[0], min = arr[0];
        for (int num : arr) {
            max = num > max ? num : max;
            min = num < min ? num : min;
        }

        System.out.println("Max: " + max + " Min: " + min);
    }

    //7. Write a function to check whether a given number is prime.
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    //8. Verify whether a number is an Armstrong number (Example: 153 → 1³ + 5³ + 3³ = 153).
    public static boolean isArmstrong(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int power = numStr.length();
        int total = 0;
        for (int i = 0; i < power; i++) {

            total += Math.pow(Integer.valueOf(numStr.charAt(i)) - 48, power);
        }

        return total == number;
    }

    //9. Count how many times each character appears in a string. (Example: "hello" → {h=1, e=1, l=2, o=1}).
    public static Map countCharacters(String str) {
        Map<Character, Integer> charCount = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if (charCount.containsKey(ch)) {
                charCount.replace(ch, charCount.get(ch) + 1);
            } else {
                charCount.put(ch, 1);
            }
        }
        return charCount;
    }

    //10. Given an array, remove duplicate elements without using built-in functions.
    public static int[] removeDuplicates(int[] arr) {
        List<Integer> arrList = new ArrayList<>();
        for (int num : arr) {
            if (!arrList.contains(num)) {
                arrList.add(num);
            }
        }
        int[] result = new int[arrList.size()];
        for (int i = 0; i < arrList.size(); i++) {
            result[i] = arrList.get(i);
        }
        return result;
    }

    //11. Given an unsorted array, find the second-largest number efficiently.
    public static int findSecondLarge(int[] arr) {
        double large, secondLarge;
        large = secondLarge = Float.NEGATIVE_INFINITY;
        for (int num : arr) {
            if (num > secondLarge) {
                if (num > large) {
                    secondLarge = large;
                    large = num;
                    continue;
                }
                secondLarge = num;
            }
        }
        return (int) secondLarge;
    }

    //12. Remove all spaces from a given string without using built-in functions.
    public static String removeAllSpaces(String str) {
        List<Character> arrList = new ArrayList<>();
        for (char ch : str.toCharArray()) {
            if (ch != ' ') {
                arrList.add(ch);
            }
        }
        StringBuilder result = new StringBuilder();
        for (char ch : arrList) {
            result.append(ch);
        }
        return result.toString();
    }

    //13. Count the number of vowels and consonants in a given string.
    public static void countVowelsConsonants(String str) {
        int vCount = 0, cCount = 0;
        for (char ch : str.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch)) {
                switch (ch) {
                    case 'a', 'e', 'i', 'o', 'u' ->
                        vCount++;
                    default ->
                        cCount++;
                }
            }
        }
        System.out.printf("%d vowels, and %d consonants\n", vCount, cCount);
    }

    //14. Find the sum of all even numbers in an array.
    public static int sumOfEven(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += (num % 2 == 0) ? num : 0;
        }
        return sum;
    }

    //15. Find the first non-repeating character in a string.
    public static char findFirstNonRepeat(String str) {
        for (char c : str.toCharArray()) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == c) {
                    count++;
                }
            }
            if (count == 1) {
                return c;
            }
        }
        return '\0';
    }

    public static void printArray(int[] arr) {
        System.out.print("{ ");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[arr.length - 1] + " }");
    }

    public static void main(String[] args) {
        // 1
        int num = 1234;
        System.out.println("Number:" + num + " Reversed:" + reverseNumber(num));

        // 2
        String str = "malayalam";
        System.out.println("\nIs " + str + " palindrome?:" + isPalindrome(str));

        // 3
        int factNum = 6;
        System.out.println("\nFactorial of " + factNum + " using recursion: " + factorialRecursion(5));
        System.out.println("Factorial of " + factNum + " using iteration: " + factorialIteration(5));

        // 4
        System.out.println("");
        printFibonacci(6);

        // 5
        System.out.println("\nSum of digits in " + num + ": " + getDigitSum(num));

        // 6
        int[] arr = {1, 3, 4, 23, 5, 5, 3};
        System.out.print("\nFor array ");
        printArray(arr);
        System.out.print(": ");
        findMaxMin(arr);

        // 7
        num = 5;
        System.out.println("\nIs " + num + " prime?: " + isPrime(num));

        // 8
        num = 371;
        System.out.println("\nIs " + num + " armstrong?: " + isArmstrong(num));

        // 9
        System.out.println("\nCharacter occurences in '" + str + "': " + countCharacters(str));

        // 10
        int[] arr2 = removeDuplicates(arr);
        System.out.print("\nFor array ");
        printArray(arr);
        System.out.print(" Removing duplicates: ");
        printArray(arr2);
        System.out.println("");

        // 11
        System.out.print("\nFor array ");
        printArray(arr);
        System.out.println(" Second largest: " + findSecondLarge(arr));

        // 12
        str = "India is my country";
        System.out.println("\nRemove spaces from '" + str + "': " + removeAllSpaces(str));

        // 13
        str = "Bharat";
        System.out.print("\nCount vowels and consonants from '" + str + "': ");
        countVowelsConsonants(str);

        // 14
        System.out.print("\nFor array ");
        printArray(arr);
        System.out.println(" Sum of even : " + sumOfEven(arr));

        // 15
        str = "malayalam";
        System.out.println("\nFirst non repeating char in " + str + ": " + findFirstNonRepeat(str));
    }
}
