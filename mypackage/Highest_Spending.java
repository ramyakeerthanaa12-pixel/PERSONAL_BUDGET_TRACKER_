package mypackage;

import java.io.BufferedReader;
import java.io.FileReader;
public class Highest_Spending{
    public void Spending(){
    String[] categories={
        "Food",
        "Travel",
        "Shopping",
        "Bills",
        "Education",
        "Entertainment",
        "Other"
    };
    int[] totals=new int[categories.length];
    try {
        FileReader f=new FileReader("Transactions.txt");
        BufferedReader br=new BufferedReader(f);
        String line;
        while ((line=br.readLine())!=null) {
            if (line.contains("Expense:")&&line.contains("Category:")) {
                String expensePart=line.substring(
                    line.indexOf("Expense:")+8,
                    line.indexOf("Category:")
                );
                int expense=Integer.parseInt(expensePart.trim());
                String category=line.substring(
                    line.indexOf("Category:")+10
                ).trim();
                for (int i=0;i<categories.length;i++) {
                    if (category.equalsIgnoreCase(categories[i])) {
                        totals[i]=totals[i]+expense;
                    }
                }
            }
        }

        br.close();

        int max=Integer.MIN_VALUE;
        String highestCategory = "";
        for (int i = 0; i < categories.length; i++) {
            if (totals[i] > max) {
                max = totals[i];
                highestCategory = categories[i];
            }
        }
        if (max == 0) {
            System.out.println("No expenses found.");
        } else {
            System.out.println("Highest Spending Category: " + highestCategory);
            System.out.println("Amount: " + max);
        }

    } catch (Exception e) {
        System.out.println(e);
    }
}
}