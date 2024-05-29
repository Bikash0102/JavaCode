import java.util.Scanner; 

import java.util.Scanner;

public class Recursionsum

{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int sum = sumOfDigits(number);
        System.out.println("Sum of digits of " + number + " is: " + sum);
    }
    
    public static int sumOfDigits(int n) {
       
        if (n < 10) {
            return n;
        }
        
        return n % 10 + sumOfDigits(n / 10);
    }


}
