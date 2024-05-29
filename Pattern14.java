package projectfiles;

import java.util.Scanner;

public class Pattern14 {
	public static void main(String[] args)
	  {
		 System.out.println("Enter the value of N");
		 Scanner sc=new Scanner(System.in);
		 int a=sc.nextInt();
		 for(int i=1;i<=a;i++)
		 {   char d='A';
			 for(int j=1;j<=a-i+1;j++)
			 {
				 System.out.print(d+" ");
				 d++;
				
			 }
			 
			 System.out.println();
		 }
	  }

}
