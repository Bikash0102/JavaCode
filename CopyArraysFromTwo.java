package projectfiles;

import java.util.Scanner;

public class CopyArraysFromTwo {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int a=sc.nextInt();
		int array1[]=new int[a];
		int array2[]=new int[a];
		for(int i=0;i<array1.length;i++)
		{
			if(sc.hasNextInt())
			{
				array1[i]=sc.nextInt();
			}
		}
		for(int i=0;i<array1.length;i++)
		{
			array2[i]=array1[i];
		}
		System.out.println("After copying the Arrays the value in arrays2");
		for(int i=0;i<array2.length;i++)
		{
			System.out.println(array2[i]);
		}
	}

}
