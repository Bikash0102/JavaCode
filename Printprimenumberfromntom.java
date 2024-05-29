package projectfiles;

import java.util.Scanner;

public class Printprimenumberfromntom {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int n= sc.nextInt();
	int m=sc.nextInt();
	 for (int i = n; i <= m; i++) {
         if (isPrime(i)) {
             System.out.print(i + " ");
         }
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
