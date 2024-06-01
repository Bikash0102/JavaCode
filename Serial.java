import java.io.*;

public class Serial implements Serializable {
   
    int a;
    String b;

    Serial(int a,String b)
    {
        this.a=a;
        this.b=b;
    }


    public static void main(String[] args)throws IOException
    {
        File fs=new File("/home/miracle/Desktop/New Folder/tex22.txt");
        Serial b=new Serial(1,"b");
        Serial c=new Serial(2,"bikash");
        FileOutputStream fl=new FileOutputStream("/home/miracle/Desktop/New Folder/tex22.txt");
        ObjectOutputStream gg=new ObjectOutputStream(fl);
        gg.writeObject(b);
        gg.writeObject(c);
        FileInputStream bq=new FileInputStream("/home/miracle/Desktop/New Folder/tex22.txt");
        ObjectInputStream cq=new ObjectInputStream(bq);
        Serial k;
        try{
        while((k=(Serial)cq.readObject())!=null)
        {
           System.out.print(k.b+""+k.a);

        }
    }
    catch(Exception e)
    {
        
    }
        
    }
    
}
