package projectfiles;

import java.util.Scanner;

public class Printnumber {

		public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			int a= sc.nextInt();
			sc.close();
			System.out.println("Forloop");
			
			for(int i=2;i<=a;i++)
			{
				if(i%2==0)
				{
					System.out.println(i);
				}
					
			}
			int i=2;
			System.out.println("Whileloop");
			
			
			while(i<=a)
			{
				if(i%2==0)
				{
					System.out.println(i);
				}
				i++;
			}
			System.out.println("Doloop");
			 i = 1;
		        do {
		            if (i % 2 == 0) {
		                System.out.println(i);
		            }
		            i++;
		        } while (i <= 20);
			
			}
			

}
