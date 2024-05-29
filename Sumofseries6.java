package projectfiles;

import java.util.Scanner;

public class Sumofseries6 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		
		int l=sc.nextInt();
		double sum=0;
		for(int i=1;i<=l;i++)
		{
			sum+=(1.0/Math.pow( l,2));
		}
		System.out.println("Answer of the pattern is "+sum);
		sc.close();
	}


}
