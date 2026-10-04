package mypackage;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Set_Monthly_Budget{
    Scanner sc=new Scanner(System.in);
    public void Set(){

        System.out.print("Enter your monthly budget: ");
        double budget=sc.nextDouble();

        if(budget<=0){
            System.out.println("Budget must be greater than 0!");
            return;
        }

        try{
            FileWriter f=new FileWriter("Budget.txt");
            f.write(String.valueOf(budget));
            f.close();

            System.out.println("Monthly budget set successfully!");

        } catch(Exception e){
            System.out.println(e);
        }
    }

    public double getBudget(){

        try{
            Scanner file=new Scanner(new File("Budget.txt"));

            if (file.hasNextDouble()) {
                double budget=file.nextDouble();
                file.close();
                return budget;
            }

            file.close();

        } catch(Exception e){
            System.out.println("No budget has been set yet.");
        }

        return 0;
    }
}