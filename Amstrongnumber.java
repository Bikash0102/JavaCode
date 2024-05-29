package projectfiles;

import java.util.Scanner;

public class Amstrongnumber {
	
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt();
		int k=a;
		int sum=0;
		int b=0;
		
		while(a>0)
		{
			b++;
			a=a/10;
		}
		a=k;
		while (a>0)
		{
			int l=a%10;
		
			sum += Math.pow(l,b);
			a=a/10;
			
		}
		if(sum==k)
		{
			System.out.println("Amstrongnumber");
		}
		else
		{
			System.out.println("Not Amstrongnumber");
		}
	}

}
