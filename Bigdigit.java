package projectfiles;

import java.util.Scanner;

public class Bigdigit {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int n= sc.nextInt();
	int large=0;
	while(n>0)
	{
		int k=n%10;
		if(k>large)
		{
			large=k;
		}
		n/=10;
	}
	System.out.println( large);
	}

}
