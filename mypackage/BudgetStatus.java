package mypackage;

import java.io.File;
import java.util.Scanner;

public class BudgetStatus{

    public void viewStatus(){

        double budget=0;
        double totalExpense = 0;

        // Read monthly budget
        try {
            Scanner b = new Scanner(new File("Budget.txt"));

            if (b.hasNextDouble()) {
                budget = b.nextDouble();
            }

            b.close();

        } catch (Exception e) {
            System.out.println("Please set your monthly budget first!");
            return;
        }

        // Read expenses
        try {
            Scanner t = new Scanner(new File("Transactions.txt"));

            while (t.hasNextLine()) {

                String line = t.nextLine();

                if (line.startsWith("Expense:")) {

                    String amount = line.substring(8).trim();
                    amount = amount.split(" ")[0];

                    totalExpense += Double.parseDouble(amount);
                }
            }

            t.close();

        } catch (Exception e) {
            System.out.println("Error reading transactions.");
            return;
        }

        double remaining = budget - totalExpense;

        System.out.println("\n========== BUDGET STATUS ==========");
        System.out.println("Monthly Budget : " + budget);
        System.out.println("Total Expenses : " + totalExpense);

        if (remaining >= 0) {
            System.out.println("Remaining      : " + remaining);
        } else {
            System.out.println("Over Budget By : " + (-remaining));
        }

        System.out.println("===================================");
    }
}