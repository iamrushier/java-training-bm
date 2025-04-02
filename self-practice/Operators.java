
class Operators {

    public static void main(String[] args) {
        int a = 10, b = 3;
        // Arithmetic
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Relational
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        // Logical
        boolean x = true, y = false;
        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(!x);

        // Bitwise
        System.out.println("AND: " + (a & b));
        System.out.println("OR: " + (a | b));
        System.out.println("XOR: " + (a ^ b));
        System.out.println("Left Shift: " + (a << 1));
        System.out.println("Right Shift: " + (a >> 1));

        // Assignment operators
        int z = 10;
        z += 5;
        z -= 3;
        z *= 2;
        z /= 4;
        z %= 3;
        System.out.println("Final Value: " + z);

        // Ternary
        int num = 10;
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(result);
    }
}
