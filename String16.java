import java.util.*;
public class String16{

     public static void main(String []args){
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the string");
          String k=sc.nextLine();
          System.out.println("Enter the substring to be replaced");
          String l=sc.nextLine();
          System.out.println("Enter the new string");
          String a=sc.nextLine();
          String s=k.replace(l,a);
          System.out.println(s);
     }
}
