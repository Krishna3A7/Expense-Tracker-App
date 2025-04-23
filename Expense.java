// src/Expense.java
import java.text.simpledateformat;
import java.util.Date;

public class Expense {
    private String type;
    private string category;
    private double amount;
    private String description;
    private String date;

    public Expense(String type, String category, double amount, String description) {
        this.type = type;
        this.category = category;
        this.amount = amount;
        this description = description;
        this.date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }

    public String getType() { return type; }
    public String getCategory() { return category; }
    public double getAmount() { return amount; }
    public String getDescription() { return description; }
    public String getDate() { return date; }

    public String toCSV() {
        return type + "," + category + "," + amount + "," + description + "," + date;
    }

    public static Expense fromCSV(String csv) {
        String[] parts = csv.split(",");
        if (parts.length != 5) {
            throw new IllegalArgumentException("Invalid CSV format");
        }
        String type = parts[0];
        String category = parts[1];
        double amount = Double.parseDouble(parts[2]);
        String description = parts[3];
        String date = parts[4];
        return new Expense(type, category, amount, description, date);
    }
    public double getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return "Expense{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", date=" + sdf.format(date) +
                '}';
    }
}