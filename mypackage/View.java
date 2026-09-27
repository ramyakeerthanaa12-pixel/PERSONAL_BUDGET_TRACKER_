package mypackage;

import java.io.File;
import java.util.Scanner;

public class View {

    public void viewTransactions() {
        //Add a=new Add();
        try {
            File f = new File("Transactions.txt");
            Scanner sc = new Scanner(f);

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }


            sc.close();
            //a.T();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}