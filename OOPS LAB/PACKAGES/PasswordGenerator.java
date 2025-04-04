import java.time.Duration;
import java.time.Instant;
import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    public static String generatePassword(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$%&*!";
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(chars.length());
            password.append(chars.charAt(index));
        }

        return password.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter password length: ");
        int length = scanner.nextInt();

        Instant start = Instant.now();

        String password = generatePassword(length);
        
        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);

        System.out.println("Generated Password: " + password);
        System.out.println("Time taken: " + timeElapsed.toMillis() + " milliseconds");

        scanner.close();
    }
}
