package projectfiles;

import java.util.Scanner;

public class Pattern16 {
   public static void main(String[] args)
   {
	   
			 System.out.println("Enter the value of N");
			 Scanner sc=new Scanner(System.in);
			 int a=sc.nextInt();
			 for(int i=1;i<=a;i++)
			 { 
				 for(int j=a;j>i;j--)
				 {
					 System.out.print("*");
					 
				 }
				 for(int k=1;k<=i;k++)
				 {
					 System.out.print(k);
				 }
				 System.out.println();
			 }
   }
}
