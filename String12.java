   import java.util.*;


public class   String12

{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
	     String s=sc.nextLine();
	     String l="";
	     int v=0,c=0;
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
	       
	     }
	     System.out.println("Vowels "+v+"Consonats "+c );
	         
	}

}
