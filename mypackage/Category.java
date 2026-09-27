package mypackage;

import java.io.FileWriter;
import java.util.Scanner;

public class Category{
    String c;
    Add a=new Add();
    public void category(){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the category");
       c=sc.nextLine();
       System.out.println("THe category saved succesfully!!");
       if(c.equals(a.category)){
        try {
            FileWriter f=new FileWriter("Category-wise expenses",true);
            f.write("Category:"+c);

            f.close();
            System.out.println(c);
        } catch (Exception e) {
        }


       }


    }

}