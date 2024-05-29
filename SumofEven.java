package projectfiles;

import java.util.Scanner;

public class SumofEven {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		  int a=sc.nextInt();
		  int sum=0;
		  for(int i=2;i<=a;i++)
		  {
			  if(i%2==0)
			  {
			  sum+=i;
			  }
		  }
			  
		   System.out.println(sum);
		 
		   
		   
   }
}
