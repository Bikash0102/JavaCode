/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Happynumber

{
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the digit");
	 int a =sc.nextInt();
	 System.out.println(happy(a));
	 
	 
	 
	}
  static boolean happy(int a)
	{
	   Set<Integer>sk=new HashSet<Integer>();
	   while(true)
	   {
	   int sum=0;
	   while(a>0)
	   {
          int k=a%10;
          sum+=k*k;
          a=a/10;
	   }
	   if(sum==1)
	   {
	       return true;
	   }
	   a=sum;
	   if(sk.contains(sum))
	   {
	       return false;
	   }
	   sk.add(sum);
	   
	}
	}
}
