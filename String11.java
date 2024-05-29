import java.util.*;
public class String11
{
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        
        String c = sc.nextLine();
        System.out.println("enter staring  name");
        String d=sc.nextLine();
         String a[] =c.split(" " );
         for(int i=0;i<a.length;i++)
         { if(a[i].startsWith(d))
         {
             System.out.println(a[i]);
         }
         }    
         
       
    }
}
