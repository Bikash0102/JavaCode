import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class SerialObject implements Serializable{

    @SuppressWarnings("unchecked")
    public static void main( String[] args) throws IOException
    {
        File k=new File("/home/miracle/Desktop/New Folder/tex21.txt");
       FileOutputStream l=new FileOutputStream("/home/miracle/Desktop/New Folder/tex22.txt");
       ArrayList<Integer>j=new ArrayList<Integer>();
       j.add(1);
       j.add(2);
       ObjectOutputStream n=new ObjectOutputStream(l);
       n.writeObject(j);
       FileInputStream lk=new FileInputStream("/home/miracle/Desktop/New Folder/tex22.txt");
       ObjectInputStream llj=new ObjectInputStream(lk);
       ArrayList<Integer> ki;
       try{
        while((ki=(ArrayList<Integer>)llj.readObject())!=null)
        {
           System.out.print(ki+" ");

        }

    }
    catch (Exception e) {
        // TODO: handle exception
    }
     
}
        
       
       
    


    
}
