import java.util.*;

public class user {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String nam = n.nextLine();

        System.out.print("Enter password: ");
        String pass = n.nextLine();
        Login p = new Login();
        p.signup(nam, pass);
    }
}
class SyntaxException extends Exception {
    SyntaxException(String message) {
        super(message);
    }
}

class Login {
    void signup(String nam, String pass) {
        System.out.println("Thanks for signing up! Please log in.");

        try {
            Scanner nn = new Scanner(System.in);

            System.out.print("Enter your name: ");
            String nm = nn.nextLine();

            System.out.print("Enter password: ");
            String pss = nn.nextLine();

            // Corrected String comparison
            if (!nm.equals(nam) || !pss.equals(pass)) {
                throw new SyntaxException("Wrong username or password");
            }
            System.out.println("Login successful!");
        } catch (SyntaxException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
