import java.util.*;
public class String13{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String c = sc.nextLine();

        char k[] = c.toCharArray();
        int l[] = new int[26];

        for (int i = 0; i < k.length; i++) {
            if (Character.isLetter(k[i])) { 
                int index = k[i] - 'a'; 
                l[index]++;
            }
        }
       for(int i=0;i<l.length;i++)
       {
           if(l[i]>0)
           {
               char p=(char)(i+'a');
               System.out.println("character "+p+" ocuring"+l[i]);
           }
       }
    }
}
