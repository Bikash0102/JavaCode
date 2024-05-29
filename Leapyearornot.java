package projectfiles;
import java.lang.*;
import java.util.Scanner;

public class Leapyearornot {
	public static void main(String[] args)
	{
		Scanner SC=new Scanner(System.in);// Create a Scanner object
		int year;
		year=SC.nextInt(); // Read user input
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("leap year"); // It's a leap year
	    } else {
	        System.out.println("Not a leap year"); // It's not a leap year
	    }
	}
  
}
