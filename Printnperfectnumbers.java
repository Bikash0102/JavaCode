package projectfiles;

import java.util.Scanner;

public class Printnperfectnumbers {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
	   int k=6;
	   int count=0;
	   while(count<number)
	   {
         if (isperfect(k)) {
             System.out.print(k + " ");
            
             count++;
             
         }
	   k++;
	   }
     }
 
	public static boolean isperfect(int a)
	{
		int sum=0;
		
		 for (int i = 1; i < a; i++) {
	            if (a % i == 0) {
	                sum += i;
	            }
	        }
		 if(sum==a)
		 {
			 return true;
		 }
		 else 
		 {
			 return false;
		 }
		
	}



}
