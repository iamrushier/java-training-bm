// # Exercise 5: Copying a File with Buffered Streams
// Copy the content of one file to another using `BufferedReader` and `BufferedWriter`.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class CopyFileDemo {

    public static void main(String[] arges) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("files/sample.txt")); BufferedWriter bw = new BufferedWriter(new FileWriter("files/copy.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                bw.append(line);
                bw.newLine();
            }
            System.out.println("File contents copied to copy.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}

// Result:
// File contents copied to copy.txt
