package projectfiles;

import java.util.Scanner;

public class OddorEven {
	public static void main(String[] args)
	{
		Scanner SC=new Scanner(System.in);// Create a Scanner object
		int a;
		a=SC.nextInt(); // Read user input
		 
		if(a>=0)
		{
			System.out.println("Positive"); // Output user input
		}
		else
		{
			System.out.println("Negative");
		}
		SC.close();
	}
	
	

}
