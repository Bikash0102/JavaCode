package projectfiles;

import java.util.Scanner;

public class Sumofseries5 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int c=sc.nextInt();
		
		double sum=0;
		for(int i=0;i<=c;i++)
		{
			sum+=(1.0/factorial(i));
		}
		System.out.println("Answer of the pattern is "+sum);
		sc.close();
	}
	static int factorial(int a)
	{
		 int f = 1;
	        for (int i = 1; i <= a; i++) {
	            f *= i;
	        }
	        return f;
	}

}
