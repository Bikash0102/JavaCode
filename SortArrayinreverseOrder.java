package projectfiles;

import java.util.Scanner;

public class SortArrayinreverseOrder {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array");
	int a=sc.nextInt();
	int array1[]=new int[a];

	for(int k=0;k<array1.length;k++)
	{
		if(sc.hasNextInt())
		{
			array1[k]=sc.nextInt();
		}
	}
	
	for(int l=0;l<array1.length-1;l++)
	{
		for(int j=0;j<array1.length-l-1;j++)
		{
			if(array1[j]<array1[j+1]) {
				int swap=array1[j+1];
				array1[j+1]=array1[j];
				array1[j]=swap;
				
			}
		}
	}
	System.out.println("after reverse sorting the ararrys is");
	for(int i=0;i<array1.length;i++)
	{
		System.out.println(array1[i]);
}
	sc.close();
}

}
