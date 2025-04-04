// # Reading from a File with Exception Handling
// Read a file and handle `FileNotFoundException`.

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class ReadFileDemo {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("files/sample.txt"));
            String line;
            System.out.println("Contents of file:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File doesn't exist");
        } catch (IOException e) {
            System.out.println("Failed to read");
        }
    }
}

// Results:
// Contents of file:
// anything
// anything
