/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class String4

{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	     String s=sc.nextLine();
	     int c=0,di=0,p=0,v=0,w=0;
	     for(int i=0;i<s.length();i++)
	     {
	         char d=s.charAt(i);
	         if((d>='A'&&d<='Z')||(d>='a'&&d<='z'))
	         {
	             d= Character.toLowerCase(d); 
      
                if (d == 'a' || d == 'e' || d == 'i' || 
                    d == 'o' || d == 'u') 
                    v++; 
                else
                    c++; 
	         }
	        else if(d>='0'&&d<='9')
	         {
	             di++;
	         }
	         else if(d==" ")
	         {
	            w++;
	            }

	         else
	         {
	             p++;
	             
	         }
	         
	     }
	     System.out.println("Vowels "+v+"Consonats "+c+"Digits "+di+"Speacial "+p+"word "+w );
	         
	}
}
