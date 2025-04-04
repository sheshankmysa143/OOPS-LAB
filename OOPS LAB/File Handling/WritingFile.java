import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WritingFile {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("C:\\Users\\prodd\\OneDrive\\Desktop\\Sheshank\\OOPS\\File Handling\\config.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            System.out.println("Reading configuration:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}