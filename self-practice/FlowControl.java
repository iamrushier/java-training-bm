
import java.util.Scanner;

class FlowControl {

    public static void main(String[] args) {
        int day = 3;
        switch (day) {
            case 1 ->
                System.out.println("Monday");
            case 2 ->
                System.out.println("Tuesday");
            case 3 ->
                System.out.println("Wednesday");
            case 4 ->
                System.out.println("Thursday");
            case 5 ->
                System.out.println("Friday");
            case 6, 7 ->
                System.out.println("Weekend!");
            default ->
                System.out.println("Invalid day");
        }

        int marks = 85;
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }

        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }

        int count = 5;
        while (count > 0) {
            System.out.println("Countdown: " + count);
            count--;
        }

        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.println("Enter positive number: ");
            number = sc.nextInt();
        } while (number <= 0);
        System.out.println("You entered: " + number);
        sc.close();
    }
}
