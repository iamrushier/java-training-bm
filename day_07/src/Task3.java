// Task 3. BiFunction with Method Reference
// Use the BiFunction interface to add two numbers via a static method reference.

import java.util.function.BiFunction;

public class Task3 {
    public static void main(String[] args) {
        int num1=5,num2=8;
        BiFunction<Integer,Integer,Integer> addition=Util::addNums;
        System.out.println("Addition: "+addition.apply(num1,num2));
    }
    public static class Util{
        public static int addNums(int a,int b){
            return a+b;
        }
    }
}
