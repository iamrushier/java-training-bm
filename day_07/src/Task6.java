// Task 6. Optional in Data Validation
// 1. Create a validation method Optional<String> validateEmail(String email);
// If the email is valid, return Optional.empty(), else return error message.

import java.util.Optional;

public class Task6 {
    public static Optional<String> validateEmail(String email) {
        if (email == null || email.trim().isEmpty() || !email.contains("@")) {
            return Optional.of("Email is invalid");
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        String email1 = "test@gmail.com";
        String email2 = "testgmail.com";
        Optional<String> errMsg1 = validateEmail(email1);
        Optional<String> errMsg2 = validateEmail(email2);

        if (errMsg1.isEmpty()) {
            System.out.println(email1+": "+"Valid email");
        } else {
            System.out.println(email1+": "+errMsg1.get());
        }

        if (errMsg2.isEmpty()) {
            System.out.println(email2+": "+"Valid email");
        } else {
            System.out.println(email2+": "+errMsg2.get());
        }
    }
}

// Results:
// test@gmail.com: Valid email
// testgmail.com: Email is invalid