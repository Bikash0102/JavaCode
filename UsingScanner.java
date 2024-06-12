import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class UsingScanner {
    public static void main(String[] args) throws FileNotFoundException
    {
        FileInputStream hk=new FileInputStream("/home/miracle/Desktop/New Folder/files.txt");
        Scanner sc=new Scanner(hk);
        int lineNumber=0;
        try{
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println("Line " + lineNumber + ": " + line); // Print line number and data
            lineNumber++;
        }
        sc.close();
        hk.close();
    }
    catch(Exception e)
    {

    }

    }
    
}
