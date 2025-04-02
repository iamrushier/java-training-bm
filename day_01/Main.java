
class Main {

    public static void main(String[] args) {
        System.out.println("1.");
        int num = 56551234;
        System.out.println("Number:" + num + " Reversed:" + NumUtils.reverseNumber(num));

        System.out.println("\n2.");
        String str = "malayalam";
        System.out.println("Is " + str + " palindrome?:" + StringUtils.isPalindrome(str));

        System.out.println("\n3.");
        int factNum = 6;
        System.out.println("Factorial of " + factNum + " using recursion: " + NumUtils.factorialRecursion(5));
        System.out.println("Factorial of " + factNum + " using iteration: " + NumUtils.factorialIteration(5));

        System.out.println("\n4.");
        NumUtils.printFibonacci(6);

        System.out.println("\n5.");
        System.out.println("Sum of digits in " + num + ": " + NumUtils.getDigitSum(num));

        int[] arr = {1, 3, 4, 23, 5, 5, 3};
        System.out.println("\n6.");
        System.out.print("For array ");
        ArrayUtils.printArray(arr);
        System.out.print(": ");
        ArrayUtils.findMaxMin(arr);

        num = 5;
        System.out.println("\n7.");
        System.out.println("Is " + num + " prime?: " + NumUtils.isPrime(num));

        num = 371;
        System.out.println("\n8.");
        System.out.println("Is " + num + " armstrong?: " + NumUtils.isArmstrong(num));

        System.out.println("\n9.");
        System.out.println("Character occurences in '" + str + "': " + StringUtils.countCharacters(str));

        int[] arr2 = ArrayUtils.removeDuplicates(arr);
        System.out.println("\n10.");
        System.out.print("For array ");
        ArrayUtils.printArray(arr);
        System.out.print(" Removing duplicates: ");
        ArrayUtils.printArray(arr2);
        System.out.println("");

        System.out.println("\n11.");
        System.out.print("For array ");
        ArrayUtils.printArray(arr);
        System.out.println(" Second largest: " + ArrayUtils.findSecondLarge(arr));

        str = "India is my country";
        System.out.println("\n12.");
        System.out.println("Remove spaces from '" + str + "': " + StringUtils.removeAllSpaces(str));

        str = "Bharat";
        System.out.println("\n13.");
        System.out.print("Count vowels and consonants from '" + str + "': ");
        StringUtils.countVowelsConsonants(str);

        System.out.println("\n14.");
        System.out.print("For array ");
        ArrayUtils.printArray(arr);
        System.out.println(" Sum of even : " + ArrayUtils.sumOfEven(arr));

        str = "malayalam";
        System.out.println("\n15.");
        System.out.println("First non repeating char in " + str + ": " + StringUtils.findFirstNonRepeat(str));
    }
}
