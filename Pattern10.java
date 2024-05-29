package projectfiles;

import java.util.Scanner;

public class Pattern10 {
	public static void main(String[] args)
	  {
		 System.out.println("Enter the value of N");
		 Scanner sc=new Scanner(System.in);
		 int a=sc.nextInt();
		 for(int i=1;i<=a;i++)
		 {  for(int m=1;m<=a-i;m++)
		    {
			 System.out.print(" ");
			 
		    }
			 
			 for(int k=i;k>1;k--)
			 {
				 System.out.print(k);
				 
			 }
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print(j);
				
			 }
			 
			 System.out.println();
		 }
	  }


}
