package projectfiles;

import java.util.Scanner;

public class Prefectnumber {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt();
		int sum=0;
		sc.close();
		 for (int i = 1; i<=a/2; i++) {
	            if (a % i == 0) {
	                sum += i;
	            }
	        }
		 if(sum==a)
		 {
			 System.out.println("Perfect Number");
		 }
		 else
		 {
			 System.out.println("Not Perfect Number ");
		 }
	}
}
