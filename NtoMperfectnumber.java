package projectfiles;

import java.util.Scanner;

public class NtoMperfectnumber {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int m=sc.nextInt();
		for(int i=n;i<=m;i++)
		{
			isperfect(i);
		}
      
		
	}
	public static void isperfect(int a)
	{
		int sum=0;
		
		 for (int i = 1; i < a; i++) {
	            if (a % i == 0) {
	                sum += i;
	            }
	        }
		 if(sum==a)
		 {
			 System.out.println(a);
		 }
		
	}

}
