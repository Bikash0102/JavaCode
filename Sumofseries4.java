package projectfiles;

import java.util.Scanner;

public class Sumofseries4 {

		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			
			
			
			double sum=0;
			for(int i=0;i<5;i++)
			{
				sum+=(1.0/Math.pow(i,2));
			}
			System.out.println("Answer of the pattern is "+sum);
			sc.close();
		}


}
