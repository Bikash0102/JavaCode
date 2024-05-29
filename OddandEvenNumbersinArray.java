package projectfiles;

import java.util.Scanner;

public class OddandEvenNumbersinArray {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int a=sc.nextInt();
		int array1[]=new int[a];
	
		for(int i=0;i<array1.length;i++)
		{
			if(sc.hasNextInt())
			{
				array1[i]=sc.nextInt();
			}
		}
		int oddsum=0;
		int evensum=0;
		for(int i=0;i<array1.length;i++)
		{ if(array1[i]%2==0)
		{
			evensum+=array1[i];
		}
		else
		{
			oddsum+=array1[i];
		}
		}
		System.out.println("Sum of Even number is "+evensum+"Sum of Odd number is "+oddsum);
	}
			
		
}
