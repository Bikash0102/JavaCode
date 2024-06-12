import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadSpecificLine {
    public static void main(String [] args) throws FileNotFoundException
    {
        FileReader fk=new FileReader("/home/miracle/Desktop/New Folder/files.txt");
        BufferedReader hk=new BufferedReader(fk);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  spcific line");
        int k=sc.nextInt();
        int l=0;
        String i;
        try{
        while((i=hk.readLine())!=null){  
        
        l++; 
        if(l==k)
        {
            System.out.println(i); 
        }
        }  

        hk.close();
        fk.close();
        
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
        
    }
    
}
