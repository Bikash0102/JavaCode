package projectfiles;

import java.util.Scanner;

public class SmallestofThreeeTernary {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int a= sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	int smallest=a<b?((a<c)?a:c):((b<c)?b:c);
	System.out.println(smallest);
	}

}
