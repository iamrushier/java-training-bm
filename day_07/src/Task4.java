// Task 4. Use Optional in a service-like function Optional<User> getUserByEmail(String email)
// 1. If found, return the user wrapped in Optional.
// 2. If not found, return Optional.empty().
// 3. Use it in a main method to check for user existence and print appropriate messages.

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class User {
    String name;
    String email;

    User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return name + " (" + email + ")";
    }
}

class Service {
    public Optional<User> getUserByEmail(List<User> users, String email) {
        return users.stream().filter(u -> u.email.equals(email)).findFirst();
    }
}

public class Task4 {

    public static void main(String[] args) {
        Service service = new Service();
        List<User> usersList = Arrays.asList(
                new User("r", "r@in"),
                new User("b", "b@in")
        );
        String emailToFind = "r@in";
        Optional<User> userOpt = service.getUserByEmail(usersList, emailToFind);
        userOpt.ifPresentOrElse(user -> System.out.println("User found: " + user), () -> System.out.println("User with email '" + emailToFind + "' not found."));
        String emailToFind2 = "g@in";
        userOpt = service.getUserByEmail(usersList, emailToFind2);
        userOpt.ifPresentOrElse(user -> System.out.println("User found: " + user), () -> System.out.println("User with email '" + emailToFind2 + "' not found."));
    }
}

// Results:
// User found: r (r@in)
// User with email 'g@in' not found.