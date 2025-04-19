import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Test2 {
    public static void main(String[] args) {
//        List<String> names = Arrays.asList("Tom", "Jerry");
//        names.forEach(Util::greet);
//        Optional<String> opt = Optional.empty();
        Optional<String> opt = Optional.of("J");

        if(opt.isPresent()){
            System.out.println(opt.get());
        }
        opt.ifPresent(System.out::println);
    }
}

class Util {
    public static void greet(String msg) {
        System.out.println("Hello, " + msg);
    }
}
