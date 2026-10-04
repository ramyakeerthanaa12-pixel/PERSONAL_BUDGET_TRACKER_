package mypackage;
import java.io.FileWriter;
import java.util.Scanner;

public class Add{
    Scanner sc=new Scanner(System.in);
    int income, expense;
    String category;
    
    //Options obj = new Options();
    public void addincome(){
        System.out.print("Add your income: ");
        income=sc.nextInt();
        System.out.println("Your income saved succesfully! ");
        addexpense();

        T();
        
    }
    public void addexpense(){
        while(true){ 
            
        System.out.println("Add the amount for your expenses : ");
        expense = sc.nextInt();
        if(expense<=0){
            System.out.println("Expense must be greater than 0!");
            return;
        }
        sc.nextLine(); 
        System.out.println("Enter the category of expenses:");
        category=sc.nextLine();
        
        T();
        System.out.println("===============Saved successfully!================");
        }
        
    
    
    }
    public void T(){
        
        try {
            FileWriter f = new FileWriter("Transactions.txt", true);
            if (income > 0 && expense == 0) {
            f.write("Income: " + income + "\n");
        }
        else if (expense > 0) {
            f.write("Expense: " + expense +
                    "    Category: " + category + "\n");
        }

        f.close();

        // Reset values
        income = 0;
        expense = 0;
        category = null;


            

        } catch (Exception e) {

            System.out.println(e);
        }
    }
    
}