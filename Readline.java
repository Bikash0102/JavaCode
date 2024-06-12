import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Readline {
    public static void main(String [] args) throws FileNotFoundException
    { FileReader kj=new FileReader("/home/miracle/Desktop/New Folder/files.txt");
        BufferedReader br=new BufferedReader(kj);
        String i;  
        try{
            int l=0;
        while((i=br.readLine())!=null){  
        System.out.println(i); 
        l++; 
        }  
        br.close();
        kj.close();
        System.out.println(l);
    }
    catch(Exception e) 
    {

    }   
   

    }
    
}
