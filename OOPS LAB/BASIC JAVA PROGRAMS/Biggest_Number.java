import java.util.Scanner;
public class Biggest_Number {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter three numbers: ");
int x = scanner.nextInt();
int y = scanner.nextInt();
int z = scanner.nextInt();
if (x > y && x > z) {
System.out.println("Largest number is: " + x);
} else if (y > z) {
System.out.println("Largest number is: " + y);
} else {
System.out.println("Largest number is: " + z);
}
}
}
