
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence;

        System.out.print("Enter: ");
        sentence = sc.nextLine();
        String[] words = sentence.split(" ");

        List<String> list = new ArrayList<>();

        for (int i = words.length - 1; i >= 0; i--) {
            list.add(words[i]);
        }

        StringBuilder sb = new StringBuilder();

        for (String word : list) {
            sb.append(word + " ");
        }
        System.out.print(sb);

    }
}
