import java.util.*;
public class String7{

     
    public static boolean compare(String str1, String str2) {
      
        if (str1 == str2) {
            return true;
        }
       else if (str1 == null || str2 == null) {
            return false;
        }

         else  if (str1.length() != str2.length()) {
            return false;
        }

       else{
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
       }

        return true;
    }
	public static void main(String[] args) {
		System.out.println("Enter the string1");
		Scanner sc=new Scanner(System.in);
		String k=sc.nextLine();
		System.out.println("Enter the string2");
		String l=sc.nextLine();
		System.out.println(compare(k,l));
		
		
	}
}
