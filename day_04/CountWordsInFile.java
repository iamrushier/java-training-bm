
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class CountWordsInFile {

    public static void main(String[] args) {
        int wordCount = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("files/demo.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split(" ");
                wordCount += words.length;
            }
            System.out.println("Total words: " + wordCount);
        } catch (FileNotFoundException e) {
            System.out.println("File not found ");
        } catch (IOException e) {
            System.out.println("Failed to read file");
        }
    }
}

// Result:
// Total words: 25
