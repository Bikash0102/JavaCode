package projectfiles;

import java.util.Scanner;

public class AlldigitsEqual {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
	
	int firstDigit = number % 10; 
    number /= 10; 
    boolean allDigitsEqual=true;
    while (number > 0) {
        int digit = number % 10; 
        if (digit != firstDigit) {
            allDigitsEqual = false;
            break; 
        }
        firstDigit=digit;
        number /= 10; 
    }
    
    if (allDigitsEqual) {
        System.out.println("All digits in the number are equal.");
    } else {
        System.out.println("Not all digits in the number are equal.");
    }
	}

}
