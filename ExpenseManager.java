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

 