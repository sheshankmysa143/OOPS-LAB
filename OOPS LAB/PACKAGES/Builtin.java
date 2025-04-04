import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;
import java.util.Date;
import java.io.FileWriter;
import java.io.IOException;

public class Builtin {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();
        System.out.println("Today's Date: " + today);
        System.out.println("Current Time: " + now);

        Random random = new Random();
        int randNumber = random.nextInt(100);
        System.out.println("Random Number: " + randNumber);

        // File 
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Date: " + today + "\n");
            writer.write("Time: " + now + "\n");
            writer.write("Random Number: " + randNumber + "\n");
            writer.close();
            System.out.println("Data successfully written to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
