package projectfiles;

import java.util.Scanner;

public class SumofAlltheElement {
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
	
	int sum=0;
	for(int i=0;i<array1.length;i++)
	{
		sum+=array1[i];
		
	}
	System.out.println(sum);
	}

}
