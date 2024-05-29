package projectfiles;

import java.util.Scanner;

public class Pattern4 {
	 public static void main(String[] args)
	  {
		 System.out.println("Enter the value of N");
		 Scanner sc=new Scanner(System.in);
		 int a=sc.nextInt();
		 for(int i=0;i<a;i++)
		 {
			 for(int j=0;j<=i;j++)
			 {
				 System.out.print(" ");
			 }
			 for(int k=0;k<a-i;k++)
			 {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
	  }

}
