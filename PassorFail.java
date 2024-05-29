package projectfiles;
import java.util.Scanner;

public class PassorFail {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a>=59)
		{
			if(a>=90&&a<=100)
			{
				System.out.println("Grade A");
			}
			else if(a>=80&&a<=89)
			{
				System.out.println("Grade B");
			}
			else if(a>=70&&a<=79)
			{
				System.out.println("Grade c");
			}
			else if(a>=60&&a<=69)
			{
				System.out.println("Grade D");
			}
			else if(a>=50&&a<=59)
			{
				System.out.println("Grade D");
			}
			
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
