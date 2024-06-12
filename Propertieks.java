import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertieks {
    public static void main(String[] args) throws IOException
    {
        Properties jk=new Properties();
        jk.setProperty("bikash","1");
        jk.setProperty("nikhil", "2");
        FileOutputStream sk=new FileOutputStream("/home/miracle/Desktop/New Folder/files12.txt");
        jk.store(sk, "Example Properties File");
        sk.close();

        

    }
    
}
