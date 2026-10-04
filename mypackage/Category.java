package mypackage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
public class Category {
    String c;
    Scanner sc = new Scanner(System.in);
    public void category() {
        
        System.out.println("Enter the category: ");
        c = sc.nextLine();
        try {
            FileReader f=new FileReader("Transactions.txt");
            BufferedReader br=new BufferedReader(f);
            String line;
            int total=0;

            while((line=br.readLine())!=null) {
                if(line.contains("Category:  "+c)) {
                    System.out.println(line);

                String expensePart=line.substring(
                    line.indexOf("Expense:")+8,
                    line.indexOf("Category:")
                );

                int expense=Integer.parseInt(expensePart.trim());

                total=total+expense;
            }
        }
        



            System.out.println("Total spending: " + total);
            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void Del() {

    System.out.print("Enter the category to delete: ");
    String del = sc.nextLine();

    try {

        File inputFile=new File("Transactions.txt");
        File tempFile=new File("temp.txt");
        BufferedReader br=new BufferedReader(new FileReader(inputFile));
        FileWriter fw=new FileWriter(tempFile);
        String line;
        while((line=br.readLine())!=null) {
            if(!line.contains("Category:  " + del)) {
                fw.write(line + "\n");
            }
        }

        br.close();
        fw.close();
        inputFile.delete();
        tempFile.renameTo(inputFile);
        System.out.println("Transaction deleted successfully!");

    } catch (Exception e) {
        System.out.println(e);
    }
}
}