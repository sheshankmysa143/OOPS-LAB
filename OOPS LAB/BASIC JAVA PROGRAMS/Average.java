import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        double[] numArray = new double[n];
        double sum = 0.0;

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numArray[i] = scanner.nextDouble();
            sum += numArray[i];
        }

        double average = sum / n;
        System.out.printf("The average is: %.2f%n", average);

        scanner.close();
    }
}
