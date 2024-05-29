package projectfiles;
import java.util.Scanner;

public class Specialcharacter {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		 char s= sc.next().charAt(0);
		if(s>='A'&&s<='Z')
		{
			System.out.println("uppercase");
		}
		else if(s>='a'&&s<='Z')
		{
			System.out.println("lovercse");
		}
		else if(s>='0'&&s<='9')
		{
			System.out.println("digits");
		}
		else
		{
			System.out.println("special character");
		}
	}

}
