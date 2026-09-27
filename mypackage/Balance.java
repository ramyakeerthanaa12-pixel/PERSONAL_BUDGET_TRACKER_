package mypackage;

import java.io.File;
import java.util.Scanner;
public class Balance{
    public void balance(){
        int totalIncome=0;
        int totalExpense=0;

        try{
            File f=new File("Transactions.txt");
            Scanner sc=new Scanner(f);

            while(sc.hasNextLine()){

                String line=sc.nextLine();

                String[] parts=line.split("    ");

                for (String part:parts) {
                    if (part.startsWith("Income:")){
                        totalIncome+=Integer.parseInt(
                            part.substring(7).trim()
                        );

                    }
                    if (part.startsWith("Expense:")){
                        totalExpense+=Integer.parseInt(
                            part.substring(8).trim()
                        );
                    }
                }
            }
            sc.close();
            int bal=totalIncome-totalExpense;

            System.out.println("Total Income  : " + totalIncome);
            System.out.println("Total Expense : " + totalExpense);
            System.out.println("Balance       : " + bal);

        } catch(Exception e){

            System.out.println(e);
        }
    }
}