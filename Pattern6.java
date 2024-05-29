package projectfiles;

import java.util.Scanner;

public class Pattern6 {
	public static void main(String[] args)
	  {
		 System.out.println("Enter the value of N");
		 Scanner sc=new Scanner(System.in);
		 int a=sc.nextInt();
		 
		 int k=1;
		 for(int i=1;i<=a;i++)
		 {
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print(k+" ");
				 k++;
			 }
			 
			 System.out.println();
		 }
	  }
}
