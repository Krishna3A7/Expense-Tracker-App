package test;

import src.Expense;

import org.junit.Test;
import static org.junit.Assert.*;

public class ExpenseTest {

    @Test
    public void testCSVConversion() {
        Expense expense = new Expense("Food", "Lunch", 12.50, "Sandwich and coffee");
        String csv = expense.toCSV();
        Expense parsedExpense = Expense.fromCSV(csv);
        assertEquals(expense.getType(), parsedExpense.getType());
        assertEquals(expense.getCategory(), parsedExpense.getCategory());
        assertEquals(expense.getAmount(), parsedExpense.getAmount(), 0.001);
        assertEquals(expense.getDescription(), parsedExpense.getDescription());
    }

    @Test(expected = RuntimeException.class)
    public void testInvalidCSV() {
        Expense.fromCSV("Invalid,Data,String");
    }
}
