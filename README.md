# Expense-Tracker-App

A user-friendly Java application to help users track their income and expenses with category filters, date records, and balance overview.

**# Tech Stack:**

Java (Core)

Java Swing (GUI)

File I/O (text/CSV file for persistent storage)

# Expense Tracker App (Java Swing)

A desktop-based Expense Tracker application built using Java and Swing. This app allows users to log their income and expenses, categorize transactions, and view summaries in an intuitive GUI format.

## Features

- Add new income or expense entries

- Choose from predefined categories (Food, Travel, Bills, etc.)

- Display all transactions in a table

- Real-time summary: Total Income, Total Expense, Balance

- Save/load data from a CSV file


## Tech Stack

- Java (Core)

- Java Swing (GUI)

- File I/O (CSV format)


## Project Structure

expense-tracker/ ├── README.md ├── src/ │ ├── Expense.java // Model class for each expense/income │ ├── ExpenseManager.java // Handles data operations │ ├── ExpenseTracker.java // GUI and app logic │ └── Main.java // Application entry point └── data/ └── expenses.csv // File for saving/loading transactions

## How to Run

1. Compile all `.java` files in the `src` folder.

2. Run the `Main` class.

```bash

javac src/*.java

java src.Main

**## Class Breakdown**

**### 1. `Expense.java`**

- Represents a single transaction.

- Fields: `date`, `type` (Income/Expense), `category`, `amount`, `description`.

**### 2. `ExpenseManager.java`**

- Manages the list of transactions.

- Handles adding entries, calculating totals, and file operations (load/save CSV).

**### 3. `ExpenseTracker.java`**

- Swing GUI: form inputs, buttons, table view.

- Calls `ExpenseManager` methods to update UI and data.

**### 4. `Main.java`**

- Starts the application by showing the GUI.

---
