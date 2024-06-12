import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Propertiesoutput {

    public static void main(String[]args) throws FileNotFoundException
    {
        Properties kl=new Properties();
        FileInputStream kk=new FileInputStream("/home/miracle/Desktop/New Folder/files12.txt");
        try{
        kl.load(kk);
        String name = kl.getProperty("bikash");
            String age = kl.getProperty("nikhil");
        
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
        catch(Exception e)
        {

        }


    }
    
}
