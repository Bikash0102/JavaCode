package projectfiles;

import java.util.Scanner;

public class Nprimenumbers {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int n= sc.nextInt();
	
    int count = 0; 
    int num = 2; 

   
    while (count < n) {
        if (isPrime(num)) {
            System.out.print(num + " ");
            count++;
        }
        num++;
    }
	}
	  static boolean isPrime(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }

}
