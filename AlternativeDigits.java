package projectfiles;

import java.util.Scanner;

public class AlternativeDigits {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int n= sc.nextInt();
	int large=0;
	int i=0;
	while(n>0)
	{ i++;
		int k=n%10;
		if(i%2==0)
		{
			large+=k;
		}
		n/=10;
	}
	System.out.println(large);
	
	}
}
