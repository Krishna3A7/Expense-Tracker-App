// src/ExpenseManager.java
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ExpenseManager {
    private List<Expense> expenses = new ArrayList<>();

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public List<Expense> getAllExpenses() {
        return expenses;
    }

    public void saveToCSV(String filePath) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Expense expense : expenses) {
                writer.write(expense.toCSV());
                writer.newLine();
            }
        }
    }

    public void loadFromCSV(String filePath) throws IOException {
        expenses.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                expenses.add(Expense.fromCSV(line));
            }
        }
    }
}