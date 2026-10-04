package mypackage;

import java.util.Scanner;

public class Options{
    public void display(){
        while(true){
        System.out.println("================================");
        System.out.println("       PERSONAL BUDGET TRACKER");
        System.out.println("================================");

        System.out.println();

        System.out.println("1. Add Income");
        System.out.println("2. Add Expense");
        System.out.println("3. View Balance");
        System.out.println("4. View All Transactions");
        System.out.println("5. Category-wise Expenses");
        System.out.println("6. Highest Spending Category");
        System.out.println("7. Set Monthly Budget");
        System.out.println("8. View Budget Status");
        //System.out.println("9. Search by Category");
        System.out.println("9. Delete Transaction");
        System.out.println("10. Save Data");
        System.out.println("11. Exit");

        System.out.println();

        System.out.println("Enter your choice:");
        Scanner sc=new Scanner(System.in);
        int ch=sc.nextInt();
        
        Add a=new Add();
        Balance b=new Balance();
        Category c=new Category();
        View v=new View();
        Save s=new Save();
        Highest_Spending h=new Highest_Spending();
        Set_Monthly_Budget s1=new Set_Monthly_Budget();
        BudgetStatus b1=new BudgetStatus();
        //View v=new View();
        //while(true){
        
        switch (ch) {
            case 1:
                a.addincome();
                break;
            case 2:
                a.addexpense();
                break;
            case 3:
                b.balance();
                break;
            case 4:
                //Add a=new Add();
                v.viewTransactions();
                break;
            case 5:
                c.category();
                break;
            case 6:
                h.Spending();
                break;
            case 7:
                s1.Set();
                break;
            case 8:
                b1.viewStatus();
                break;

            case 9:
                c.Del();
                break;

            case 10:
                s.save();
                break;



            case 11:
                System.exit(0);

            default:
                throw new AssertionError();
        }
        }

    }
}
