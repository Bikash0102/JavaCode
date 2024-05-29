import java.util.*;
public class String6{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String l=sc.nextLine();
        String k[]=l.split(" ");
        for(int i=0;i<k.length;i++)
        {
            System.out.print(k[i].substring(0,1).toUpperCase()+k[i].substring(1)+" ");
        }
     }
}
