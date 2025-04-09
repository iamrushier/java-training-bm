
interface StringProcessor {

    String process(String input);

    default String toUpperCase(String input) {
        return input.toUpperCase();
    }

    static String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}

public class Task3 {

    public static void main(String[] args) {
        String input = "Hello Java!";
        StringProcessor removeSpaces = str -> str.replaceAll(" ", "");
        StringProcessor replaceVowels = str -> str.replaceAll("[AEIOUaeiou]", "*");

        System.out.println("Original String: " + input);
        System.out.println("Without spaces: " + removeSpaces.process(input));

        System.out.println("Vowels replaced: " + replaceVowels.process(input));

        System.out.println("Upper cases: " + removeSpaces.toUpperCase(input));

        System.out.println("Reversed: " + StringProcessor.reverse(input));
    }
}

// Results:
// Original String: Hello Java!
// Without spaces: HelloJava!
// Vowels replaced: H*ll* J*v*!
// Upper cases: HELLO JAVA!
// Reversed: !avaJ olleH
