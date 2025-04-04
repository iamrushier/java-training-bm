# Multi-Catch Exception Handling

Handle multiple exception types in a single `catch` block.

## Task

1. Take two numbers as input.
2. Perform division and array element access.
3. Handle `ArithmeticException` (division by zero) and `ArrayIndexOutOfBoundsException` in a single catch block.

---

# Custom Bank Transaction Exception

Implement custom exception handling for bank transactions.

## Task

1. Create a `LowBalanceException` (custom exception).
2. Create a `BankAccount` class with:
   - `balance` field.
   - `withdraw(amount)` method that throws `LowBalanceException` if `balance < amount`.
3. In `main`, create an account with a balance of 5000 and try to withdraw 7000.
4. Catch and display the exception message.

---

# Creating and Writing to a File (Using `FileWriter`)

## Task

1. Create a file named `sample.txt`.
2. Write `"anything"` into the file.
3. Close the file properly.

---

# Writing to a File (Using `BufferedWriter`)

## Task

4. Use existing file `sample.txt`.
5. Write `"anything"` into the file, but it should append to the existing content at the bottom.
6. Close the file properly.

---

# Reading from a File with Exception Handling

Read a file and handle `FileNotFoundException`.

---

# Exercise 5: Copying a File with Buffered Streams

Copy the content of one file to another using `BufferedReader` and `BufferedWriter`.

---

# Exercise 6: Counting Words in a File

## Task

1. Read a text file using `BufferedReader`.
2. Count the number of words in the file (split by spaces).
3. Display the total word count.
