
interface Calculator {

    int calculate(int a, int b);
}

public class Task1 {

    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 6;
        Calculator add = (a, b) -> a + b;
        Calculator subtract = (a, b) -> a - b;
        Calculator multiply = (a, b) -> a * b;
        Calculator divide = (a, b) -> a / b;

        System.out.println(num1 + " + " + num2 + " = " + add.calculate(num1, num2));
        System.out.println(num1 + " - " + num2 + " = " + subtract.calculate(num1, num2));
        System.out.println(num1 + " * " + num2 + " = " + multiply.calculate(num1, num2));
        System.out.println(num1 + " / " + num2 + " = " + divide.calculate(num1, num2));
    }
}

// Results
// 4 + 6 = 10
// 4 - 6 = -2
// 4 * 6 = 24
// 4 / 6 = 0
