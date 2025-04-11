## Method Reference and Optional class exercises

Task 1. Create a program using a static method reference to check if numbers are even (Math::isEven).

Task 2. Constructor Reference:
Create a custom class Person with attributes name and age. Use constructor references to instantiate a list of Person objects from a list of names and ages.

Task 3. BiFunction with Method Reference
Use the BiFunction interface to add two numbers via a static method reference.

Task 4. Use Optional in a service-like function Optional<User> getUserByEmail(String email)
1. If found, return the user wrapped in Optional.
2. If not found, return Optional.empty().
3. Use it in a main method to check for user existence and print appropriate messages.

Task 5. Use Optional with Enum parsing
1. Write a method that parses a string into an Enum, and return an Optional<EnumType>. Return empty if parsing fails (invalid enum name).  
   
Task 6. Optional in Data Validation
1. Create a validation method Optional<String> validateEmail(String email); sageIf the email is valid, return Optional.empty(), else return error message.