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

        T();
    }
    public void addexpense(){
        System.out.println("Add the amount for your expenses : ");
        expense = sc.nextInt();
        if (expense<=0) {
            System.out.println("Expense must be greater than 0!");
            return;
        }
        sc.nextLine(); 
        System.out.println("Enter the category of expenses:");
        category=sc.nextLine();
        System.out.println("===============Saved successfully!================");

        T();
    }
    public void T(){
        
        try {
            
            FileWriter f = new FileWriter("Transactions.txt", true);
            f.write("Income: " + income + "    Expense: " + expense +"    Category:  "+category+"\n");
            f.close();

            

        } catch (Exception e) {

            System.out.println(e);
        }
    }
    
}