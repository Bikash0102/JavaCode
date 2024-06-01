import java.io.*;
public class Dile {
    public static void main(String [] args)throws IOException
    {
        File a = new File("/home/miracle/Desktop/New Folder/files.txt");
         if(a.createNewFile())
         {
            System.out.println("File exists");
         }
         FileOutputStream b=new FileOutputStream("/home/miracle/Desktop/New Folder/files.txt");
         BufferedOutputStream bout=new BufferedOutputStream(b);    
         String s="Wellcome to Miracle";
         String ki="Wellcome to my world";
         byte c[]=s.getBytes();
         byte di[]=ki.getBytes();
         bout.write(di);
         b.write(c); 
         bout.close();   
         b.close();

         FileInputStream d=new FileInputStream("/home/miracle/Desktop/New Folder/files.txt");
         BufferedInputStream bou=new BufferedInputStream(d); 
         int k=0;
         while((k=bou.read())!=-1)
         {
            System.out.print((char)k);

         }

         int l=0;
         while((l=d.read())!=-1)
         {
            System.out.print((char)l);

         }

    }

    
    
}
