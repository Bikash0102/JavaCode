import java.util.*;
public class String9{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String l=sc.nextLine();
        
      char k[]=l.toCharArray();
      Arrays.sort(k);
      String alphabeticalorder=new String(k);
      
        for(int i=0;i<k.length/2;i++)
        {
            char temp=k[i];
            k[i]=k[k.length-1-i];
            k[k.length-1-i]=temp;
            
        }
        String reversealphabeticalorder=new String(k);
        System.out.println("Alphabetical order "+alphabeticalorder+"   "+"Reversealphabeticalorder "+reversealphabeticalorder);
     }
}
