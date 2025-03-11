import java.util.Scanner;
public class Largest_Number {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter number of elements: ");
int n = scanner.nextInt();
int a[] = new int[n];
System.out.println("Enter elements: ");
for (int i = 0; i < n; i++) {
a[i] = scanner.nextInt();
}
int max = a[0];
for (int i = 0; i < n; i++) {
if (max < a[i]) {
max = a[i];
}
}
System.out.println("Maximum value: " + max);
}
}
