package projectfiles;

import java.util.Scanner;
public class Pattern11 {
	public static void main(String[] args)
	  {
		 System.out.println("Enter the value of N");
		 Scanner sc=new Scanner(System.in);
		 int a=sc.nextInt();
	
		 for(int i=1;i<=a;i++)
		 { 
			
			 for(int j=1;j<=i-1;j++)
			 {
				
				 
					 System.out.print(" ");
			 }
					 
			 for(int k=i;k<=a;k++) 
				 {
				 System.out.print(k+" ");
				 }
				 
			 
			 System.out.println();
		
		 }
	  
	for(int k=a-1;k>=1;k--)
	{
		for(int l=1;l<=k-1;l++)
		{
			System.out.print(" ");
		}
		for(int g=k;g<=a;g++)
		{
			System.out.print(g+" ");
		}
		System.out.println();
	}
	  }


}

