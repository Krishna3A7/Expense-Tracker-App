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

        
