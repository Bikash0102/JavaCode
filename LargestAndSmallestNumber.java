package projectfiles;

import java.util.Scanner;

public class LargestAndSmallestNumber {
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
		
		int largest=array1[0];
		int smallest=array1[0];
		
		for(int i=1;i<array1.length;i++)
		{
			if(largest<array1[i])
			{
				largest=array1[i];
			}
			if(smallest>array1[i])
			{
				smallest=array1[i];
			}
				
					
		}
		System.out.println("The the largest number is "+largest+" The the smallest number is "+smallest);
	}
}
