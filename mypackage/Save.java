package mypackage;
import java.io.File;
import java.util.Scanner;
public class Save{

    public void save() {
        //Add a=new Add();
        try {
            File f = new File("Transactions.txt");
            Scanner sc = new Scanner(f);
            System.out.println("Saved successfully");


            sc.close();
            //a.T();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}