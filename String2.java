/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class String2

{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    int length=0;
	    char k[]=s.toCharArray();
	    for(int i=0;i<k.length;i++)
	    {
	        length++;
	    }
	    System.out.println(length);
	    
	    String l="";
	    for(int o=k.length-1;o>=0;o--)
	    {
	        l+=k[o];
	        
	        
	    }
	    System.out.println(l);
	    
	    
	    

	    
		
	}
}
