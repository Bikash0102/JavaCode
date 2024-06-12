import java.util.*;
public class ArithmeticException{
public static void main(String [] args)
    {
	
      Scanner sc = new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();
        try {
            int c=a/b;
            System.out.println(c);
            
        } catch(Exception e) {
            e.printStackTrace();
            }
        
        finally{
            System.out.println("code executed successfully");
        }
        }
        
    
}
