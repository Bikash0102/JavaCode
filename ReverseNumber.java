package projectfiles;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt();
		System.out.println("Before reverse"+a);
		sc.close();
		int k=0;
		while(a>0)
		{
			int l=a%10;
			k=k*10+l;
			a=a/10;
		}
		System.out.println("After reverse"+k);
	}
}
