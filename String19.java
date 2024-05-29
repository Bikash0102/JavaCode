import java.util.*;
public class String18{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String c = sc.nextLine();
         String a[] =c.split(" " );
         for(int i=a.length-1;i>=0;i--)
         {
             System.out.println(a[i]);
         }
       
    }
}
