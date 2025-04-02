
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class InputOutput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.printf("Enter your fullname: ");
        String name = sc.nextLine();
        String address;
        System.out.print("Enter your address: ");
        try {
            address = reader.readLine();
        } catch (IOException e) {
            address = sc.nextLine();
        }

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("-".repeat(10) + "Your Bio" + "-".repeat(10));
        System.out.printf("Fullname:\t%s\n", name);
        System.out.printf("Address:\t%s\n", address);
        System.out.println("Age:\t\t" + age);
        sc.close();
    }
}
