import java.util.*;
public class String10

{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
	     String s=sc.nextLine();
	     String l="";
	     for(int i=0;i<s.length();i++)
	     {
	         char d=s.charAt(i);
	         if((d>='A'&&d<='Z')||(d>='a'&&d<='z'))
	         {
	               l+=d;
	         }
	     }
	     System.out.println(l);
	     
	         
	}

}
