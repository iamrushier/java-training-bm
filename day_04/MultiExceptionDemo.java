// Handle multiple exception types in a single `catch` block.
// 1. Take two numbers as input.
// 2. Perform division and array element access.
// 3. Handle `ArithmeticException` (division by zero) and `ArrayIndexOutOfBoundsException` in a single catch block.

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class MultiExceptionDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arrList = Arrays.asList(6, 0, 3, 4, -12);
        System.out.println("Array is of length 5: " + arrList);
        System.out.print("Enter index of divisor: ");
        int index1 = sc.nextInt();
        System.out.print("Enter index of dividend: ");
        int index2 = sc.nextInt();

        try {
            int divisor = arrList.get(index1);
            int dividend = arrList.get(index2);
            int result = divisor / dividend;
            System.out.printf("Result of division %d / %d = %d", divisor, dividend, result);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Excpetion occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}

// Results:
// Array is of length 5: [6, 0, 3, 4, -12]
// Enter index of divisor: 0
// Enter index of dividend: 2
// Result of division 6 / 3 = 2
// Array is of length 5: [6, 0, 3, 4, -12]
// Enter index of divisor: 4
// Enter index of dividend: 1
// Excpetion occurred: / by zero
