package projectfiles;

import java.util.Scanner;

public class PrintElementsInreverseorder {
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
		for(int i=array1.length-1;i>=0;i--)
		{
			System.out.println(array1[i]);
		}
	}
}
