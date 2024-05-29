package projectfiles;
import java.util.*;
public class Pattern15 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of N");
		int a=sc.nextInt();
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<2*i+1;j++)
			{
				
				if(i==j)
				{
					System.out.print(i+1);
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
