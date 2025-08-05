import java.io.*;
import java.util.Scanner;

public class FileHandler {

    // File name to use
    private static final String FILE_NAME = "sample.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Step 1: Write to the file
            System.out.println("=== Writing to File ===");
            writeFile("Hello, this is a sample file. This file contains sample text.");

            // Step 2: Read the file
            System.out.println("\n=== Reading from File ===");
            readFile();

            // Step 3: Modify file content
            System.out.print("\nEnter word to replace: ");
            String oldWord = scanner.nextLine();

            System.out.print("Enter new word: ");
            String newWord = scanner.nextLine();

            modifyFile(oldWord, newWord);

            // Step 4: Read modified file
            System.out.println("\n=== Reading Modified File ===");
            readFile();

        } catch (IOException e) {
            // Handle I/O exceptions
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Close scanner resource
            scanner.close();
        }
    }

    // Method to write to a file
    public static void writeFile(String content) throws IOException {
        // Create a FileWriter for the target file
        FileWriter writer = new FileWriter(FILE_NAME);

        // Write content to the file
        writer.write(content);

        // Close writer to release resources
        writer.close();
        System.out.println("File written successfully.");
    }

    // Method to read from a file
    public static void readFile() throws IOException {
        // Create a FileReader and wrap it in a BufferedReader
        FileReader reader = new FileReader(FILE_NAME);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line;

        // Read file line by line and print to console
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        // Close reader
        bufferedReader.close();
    }

    // Method to modify file content
    public static void modifyFile(String oldWord, String newWord) throws IOException {
        File file = new File(FILE_NAME);

        // Read original file content
        BufferedReader reader = new BufferedReader(new FileReader(file));
        StringBuilder content = new StringBuilder();
        String line;

        // Replace occurrences of oldWord with newWord line by line
        while ((line = reader.readLine()) != null) {
            content.append(line.replaceAll(oldWord, newWord)).append("\n");
        }

        // Close reader
        reader.close();

        // Write the modified content back to the file
        FileWriter writer = new FileWriter(file);
        writer.write(content.toString());

        // Close writer
        writer.close();

        System.out.println("File modified successfully.");
    }
}


