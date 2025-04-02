
import java.util.ArrayList;
import java.util.List;

class ArrayUtils {

    //6. Given an array, find the largest and smallest numbers without sorting.
    public static void findMaxMin(int[] arr) {
        int max = arr[0], min = arr[0];
        for (int num : arr) {
            max = num > max ? num : max;
            min = num < min ? num : min;
        }

        System.out.println("Max: " + max + " Min: " + min);
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

    //14. Find the sum of all even numbers in an array.
    public static int sumOfEven(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += (num % 2 == 0) ? num : 0;
        }
        return sum;
    }

    public static void printArray(int[] arr) {
        System.out.print("{ ");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[arr.length - 1] + " }");
    }
}
