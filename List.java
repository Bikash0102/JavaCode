/* Online Java Compiler and Editor */
import java.util.*;
public class HelloWorld{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);

           ArrayList<Integer> a = new ArrayList<>();
              ArrayList<Integer> b = new ArrayList<>();


      System.out.println("Enter the number of elememts to be insert int List1");
      int k=sc.nextInt();
      for(int i=0;i<k;i++)
      {
          int l=sc.nextInt();
          a.add(l);
      }
      System.out.println("Enter the number of elememts to be insert in list2");
      int j=sc.nextInt();
      for(int i=0;i<j;i++)
      {
          int o=sc.nextInt();
          b.add(o);
      }
      System.out.println("Size of the list is"+a.size());
        System.out.println("Size of the list is"+b.size());
        for(int i:b)
        {
            System.out.println(i);
        }
        System.out.println("Add data in first index");
        int q=sc.nextInt();
        b.add(1,q);
           for(int i:b)
        {
            System.out.println(i);
        }
         System.out.println("Enter element to be removed from array list");
         int x=sc.nextInt();
         b.remove(x);
         
            for(int i:b)
        {
            System.out.println(i);
        }
        a.removeAll(b);
          for(int i:a)
        {
            System.out.println(i);
        }
        int n=sc.nextInt();
        System.out.println("Index of "+n+"is"+b.indexof(n));
        if(b.isEmpty()==true)
        {
            System.out.println("The list is empty");
        }
        
        
         
        
     
     
     }
}
