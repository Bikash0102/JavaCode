import java.util.*;
import java.io.*;
public class Exception1{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
         int b=sc.nextInt();
         try
         {
             int c=a/b;
             System.out.println(c);
         }
         catch(ArithmeticException e)
         {
             e.printStackTrace();
         }
        
     }
}
