package projectfiles;
import java.util.*;
public class Sumofseries1 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value");
		int k;
		k=sc.nextInt();
		double sum=0;
		for(int i=1;i<=k;i++)
		{
			sum+=(1.0/i);
		}
		System.out.println("Answer of the pattern is "+sum);
	}

}
