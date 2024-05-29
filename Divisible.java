package projectfiles;
import java.util.Scanner;
public class Divisible {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt();
		
		sc.close();
		if((a%5==0)&&(a%3==0))
		{
			System.out.print("Divisible");
			
		}
		
	}

}
