/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class String5
{
	public static void main(String[] args) {
	  	Scanner sc=new Scanner(System.in);
	     String s=sc.nextLine();
	     System.out.println("Enter the Character to be deleted");
	     char c=sc.next().charAt(0);
	     String news="";
	     for(int i=0;i<s.length();i++)
	     {
	         if(s.charAt(i)!=c)
	         {
	             news+=s.charAt(i);
	         }
	     }
	     System.out.println(news);
	}
}
