
// # Writing to a File (Using `BufferedWriter`)
// 4. Use existing file `sample.txt`.
// 5. Write `"anything"` into the file, but it should append to the existing content at the bottom.
// 6. Close the file properly.
import java.io.BufferedWriter;
import java.io.FileWriter;

class WriteFileDemo {

    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("files/sample.txt", true))) {
            writer.newLine();
            writer.append("anything");
            System.out.println("Writing to file complete!");
        } catch (Exception e) {
            System.out.println("Failed to write to file!");
            // e.printStackTrace();
        }
    }
}

// Results:
// Writing to file complete!
