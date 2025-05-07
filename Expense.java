// src/Expense.java
import java.text.simpledateformat;
import java.util.Date;

public class Expense {
    private String type;
    private string category;
    private double amount;
    private String description;
    private String date;

    // Constructor with current date (used in addExpense)
    public Expense(String type, String category, double amount, String description) {
        this.type = type;
        this.category = category;
        this.amount = amount;
        this description = description;
        this.date = new Date();

        // Constructor with specific date (used in fromCSV)
    public Expense(String type, String category, double amount, String description, Date date) {
        this.type = type;
        this.category = category;
        this.amount = amount;
        this.description = description;
        this.date = date;
    }

    public String getType() { return type; }
    public String getCategory() { return category; }
    public double getAmount() { return amount; }
    public String getDescription() { return description; }
    public String getDate() { return date; }

    public String toCSV() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return type + "," + category + "," + amount + "," + description + "," + sdf.format(date);
    }

    public static Expense fromCSV(String csv) {
        try {
            String[] parts = csv.split(",");
        if (parts.length != 5) {
            throw new IllegalArgumentException("Invalid CSV format");
        }
        String type = parts[0];
        String category = parts[1];
        double amount = Double.parseDouble(parts[2]);
        String description = parts[3];
        String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(parts[4]);
        return new Expense(type, category, amount, description, date);
    }catch (Exception e) {
        throw new RuntimeException("Failed to parse CSV: " + e.getMessage());""
    }
}
    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return "Expense{" +
                "type='" + type + '\'' +
                ", category='" + category + '\'' +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                ", date=" + sdf.format(date) +
                '}';
    }
}