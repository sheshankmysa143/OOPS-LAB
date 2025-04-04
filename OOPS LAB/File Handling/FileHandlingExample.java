import java.io.*;

public class FileHandlingExample {
    public static void main(String[] args) {
     
        String fileName = "example.txt";
        
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Hello, this is a test file!\n");
            writer.write("This is line 2.");
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

       
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            System.out.println("\nFile contents:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

    
        try (FileWriter writer = new FileWriter(fileName, true)) { 
            writer.write("\nThis is an appended line.");
            System.out.println("\nSuccessfully appended to the file.");
        } catch (IOException e) {
            System.out.println("Error appending to file: " + e.getMessage());
        }

       
        try (FileInputStream fis = new FileInputStream(fileName)) {
            System.out.println("\nReading using FileInputStream:");
            int content;
            while ((content = fis.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}