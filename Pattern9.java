package projectfiles;

import java.util.Scanner;

public class Pattern9 {
	public static void main(String[] args)
	  {
		 System.out.println("Enter the value of N");
		 Scanner sc=new Scanner(System.in);
		 int a=sc.nextInt();
		 for(int i=1;i<=a;i++)
		 {  
			 for(int j=1;j<=i;j++)
			 {
				 if(j%2==0)
				 {
				 System.out.print(0);
				 }
				 else
				 {
					 System.out.print(1);
				 
				 }
				
			 }
			 
			 System.out.println();
		 }
	  }

}
