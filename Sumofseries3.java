package projectfiles;

import java.util.Scanner;

public class Sumofseries3 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		
		
		double sum=0;
		for(int i=1;i<=5;i++)
		{
			sum+=(1.0/Math.pow(i, i-1));
		}
		System.out.println("Answer of the pattern is "+sum);
		sc.close();
	}


}
