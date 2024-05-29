package projectfiles;

import java.util.Scanner;

public class DuplicateElementInarray {
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
		System.out.println("Duplicate Elements are");
		for(int i=0;i<array1.length;i++)
		{
			for(int j=i+1;j<array1.length;j++)
			{
				if(array1[i]==array1[j]) {
					System.out.println(array1[i]);
				}
			}
		}
	}

}
