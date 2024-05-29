import java.util.*;
public class String8{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
	     String s=sc.nextLine();
	     int length=0;
	     for(char c:s.toCharArray())
	     {
	         length++;
	     }
	     System.out.println(length);
     }
}
