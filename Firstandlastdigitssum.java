package projectfiles;

import java.util.Scanner;

public class Firstandlastdigitssum {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt();
		sc.close();
		int b=a;
		while(a>=10)
		{
			a=a/10;
		}
		int sum=a+b%10;
		System.out.println(sum);
			
		}
		

}
