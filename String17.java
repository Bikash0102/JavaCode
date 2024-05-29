import java.util.*;
public class String17{

     public static void main(String []args){
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the string");
          String k=sc.nextLine();
          System.out.println("Enter the string to be searched");
          String l=sc.nextLine();
          
          if(k.contains(l))
          {
              System.out.println("The string is present");
          }
          else
          {
              System.out.println("The string is not present");
          }
        
     }
}
