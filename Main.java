// src/Main.java
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final String FILE_PATH = "expenses.csv";

    public static void main(String[] args) {
        ExpenseManager manager = new ExpenseManager();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- Expense Tracker Menu ---");
            System.out.println("1. Add Expense");
            System.out.println("2. List Expenses");
            System.out.println("3. Save to CSV");
            System.out.println("4. Load from CSV");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    System.out.print("Enter type (Income/Expense): ");
                    String type = scanner.nextLine();

                    System.out.print("Enter category: ");
                    String category = scanner.nextLine();

                    System.out.print("Enter amount: ");
                    double amount = Double.parseDouble(scanner.nextLine());

                    System.out.print("Enter description: ");
                    String description = scanner.nextLine();

                    manager.addExpense(new Expense(type, category, amount, description));
                    System.out.println("✅ Expense added.");
                    break;

                case "2":
                    List<Expense> expenses = manager.getAllExpenses();
                    if (expenses.isEmpty()) {
                        System.out.println("❌ No expenses found.");
                    } else {
                        System.out.println("\nExpenses:");
                        for (Expense e : expenses) {
                            System.out.println(e);
                        }
                    }
                    break;

                case "3":
                    try {
                        manager.saveToCSV(FILE_PATH);
                        System.out.println("✅ Saved to " + FILE_PATH);
                    } catch (IOException e) {
                        System.out.println("❌ Error saving: " + e.getMessage());
                    }
                    break;

                case "4":
                    try {
                        manager.loadFromCSV(FILE_PATH);
                        System.out.println("✅ Loaded from " + FILE_PATH);
                    } catch (IOException e) {
                        System.out.println("❌ Error loading: " + e.getMessage());
                    }
                    break;

                case "5":
                    running = false;
                    break;

                default:
                    System.out.println("❌ Invalid option.");
            }
        }

        scanner.close();
    }
}
