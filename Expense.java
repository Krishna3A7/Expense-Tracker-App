// src/Expense.java
import java.text.simpledateformat;
import java.util.Date;

public class Expense {
    private String name;
    private double amount;
    private Date date;

    public Expense(String name, double amount, Date date) {
        this.name = name;
        this.amount = amount;
        this.date = date;
    }

    public String getName() {
        return name;
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