
// # Creating and Writing to a File (Using `FileWriter`)
// 1. Create a file named `sample.txt`.
// 2. Write `"anything"` into the file.
// 3. Close the file properly.
import java.io.FileWriter;
import java.io.IOException;

class CreateFileDemo {

    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("files/sample.txt");
            writer.write("anything");
            System.out.println("File created successfully!");
            writer.close();
        } catch (IOException e) {
            System.out.println("Failed to create a file: " + e);
        }

    }

}

// Results:
// File created successfully!
