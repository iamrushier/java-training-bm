
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class StringUtils {

    //2. Determine whether a given number or string is a palindrome (Example: 121, madam).
    public static boolean isPalindrome(String string) {
        String strReverse = new StringBuilder(string).reverse().toString();
        return string.equals(strReverse);
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
}
