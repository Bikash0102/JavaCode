package projectfiles;
import java.util.Arrays;

import java.util.Scanner;

public class FrequencyofeachElement {
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
		Arrays.sort(array1);
		 int count=1;
	 for(int i=1;i<array1.length;i++)
	 {
	
		 if(array1[i]==array1[i-1])
		 {
			 count++;
		 }
		 else
		 {
			 System.out.println("The element "+array1[i-1]+" ocuurs "+count+" Times");
			 count=1;
		 }
	 }
	 System.out.println("The element "+array1[array1.length-1]+" ocuurs "+count+" Times"); 
	 }

}
