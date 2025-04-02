
class NumUtils {

    //1. Write a Java program to reverse an integer. (Example: Input 1234, Output 4321).
    public static int reverseNumber2(int number) {
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

    public static int reverseNumber(int number) {
        int newNumber = 0;
        int length = 0;
        for (int temp = number; temp != 0; temp /= 10) {
            length++;
        }
        int multiplier = (int) Math.pow(10, length - 1);
        while (number > 0) {
            newNumber += (number % 10) * multiplier;
            number /= 10;
            multiplier /= 10;
        }
        return newNumber;
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
}
