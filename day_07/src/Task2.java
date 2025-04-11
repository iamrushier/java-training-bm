//  Task 2. Constructor Reference:
//  Create a custom class Person with attributes name and age.
//  Use constructor references to instantiate a list of Person objects from a list of names and ages.

import java.util.*;
import java.util.function.BiFunction;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class Task2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ramesh", "Suresh", "Dinesh");
        List<Integer> ages = Arrays.asList(24, 27, 65);

        BiFunction<String, Integer, Person> personConstruct = Person::new;

        List<Person> people = new ArrayList<>();
        for (int i = 0; i < names.size(); i++) {
            people.add(personConstruct.apply(names.get(i), ages.get(i)));
        }
        people.forEach(System.out::println);
    }
}

// Result:
// Ramesh (24)
// Suresh (27)
// Dinesh (65)
