public class Arrays {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
        
        numbers[2] = 100;
        System.out.println("\nAfter modifying index 2:");
        for (int num : numbers) {
            System.out.println(num);
        }
        
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("\nSum of array elements: " + sum);
    }
}
