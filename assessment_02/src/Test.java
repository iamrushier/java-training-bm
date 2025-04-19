import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
//        List<Integer> arrList= Arrays.asList(2,4,13,3);
//        List<Integer> test=arrList.stream().sorted((a,b)->a.compareTo(b)).toList();
//        System.out.println(test);

        Predicate<String> testLength= s->s.length()>0;

        System.out.println(testLength.test("Go"));


    }
}
