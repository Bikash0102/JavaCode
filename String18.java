import java.util.*;
public class String18{

     
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	     String s=sc.nextLine();
	     double c=0,di=0,p=0,v=0,upper=0,lower=0;
	     int len=s.length();
	     for(int i=0;i<s.length();i++)
	     {
	         char d=s.charAt(i);
	         if(d>='A'&&d<='Z')
	         { upper++;
	             d= Character.toLowerCase(d); 
      
                if (d == 'a' || d == 'e' || d == 'i' || 
                    d == 'o' || d == 'u') 
                    v++; 
                else
                    c++; 
	         }
	         else if(d>='a'&&d<='z')
	         { lower++;
	             
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
	         

	         else
	         {
	             p++;
	             
	         }
	         
	     }
	     System.out.println("Vowels p "+(v/len)*100+"Consonats "+(c/len)*100+"Digits "+(di/len)*100+"Speacial "+(p/len)*100+"lower case"+(lower/len)*100+"uppercase "+(upper/len)*100);
	         
	}
}
