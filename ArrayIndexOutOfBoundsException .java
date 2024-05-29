import java.util.*;
public class  ArrayIndexOutOfBoundsException {
public static void main(String [] args)
    {
	
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int a=sc.nextInt();
        int array[]=new int[a];
        try {
             System.out.println("Index of access element");
              int k=sc.nextInt();
              System.out.println(array[k]);
            
        } catch( ArrayIndexOutOfBoundsException e ) {
            e.printStackTrace();
            }
        
        finally{
            System.out.println("code executed successfully");
        }
        }
        
    
}
