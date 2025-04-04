// Define the package

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskManager {
    private static final String FILE_NAME = "tasks.txt";
    private static List<String> tasks = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nTo-Do List Manager");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Exit and Save");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    // Add a new task
                    System.out.print("Enter task description: ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    System.out.println("Task added!");
                    break;

                case 2:
                    // Display tasks
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available.");
                    } else {
                        System.out.println("\nYour Tasks:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;

                case 3:
                    // Save tasks and exit
                    saveTasks();
                    System.out.println("Tasks saved. Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    // Load tasks from file
    private static void loadTasks() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                tasks.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No previous tasks found.");
        } catch (IOException e) {
            System.out.println("Error reading tasks: " + e.getMessage());
        }
    }

    // Save tasks to file
    private static void saveTasks() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (String task : tasks) {
                bw.write(task);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving tasks: " + e.getMessage());
        }
    }
}
