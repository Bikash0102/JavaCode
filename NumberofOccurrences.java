package projectfiles;

import java.util.Scanner;

public class NumberofOccurrences {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
	int[] digitCount = new int[10]; 
    while (number > 0) {
        int digit = number % 10; 
        digitCount[digit]++;
        number /= 10; 
    }
    
    for (int i = 0; i < 10; i++) {
        if (digitCount[i] > 0) {
            System.out.println("Digit " + i + " occurs " + digitCount[i] + " time(s)");
        }
    }
	}
}
