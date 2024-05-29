package projectfiles;

import java.util.Scanner;

public class SumofNaturalNumbers {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		sc.close();
		  int sum = (n * (n + 1)) / 2;
		  System.out.println(sum);
	}
		
}
