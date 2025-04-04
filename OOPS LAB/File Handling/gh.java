import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class gh {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        String filePath = "output.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String name : names) {
                writer.write(name);
                writer.newLine();
            }
            System.out.println("ArrayList successfully written to file!");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
