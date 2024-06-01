import java.util.*;


public class Demo1 {
    public static void main(String args[])
    {
        Map<Integer, String>mk=new HashMap<Integer,String>();
        mk.put(1,"bikash");
        mk.put(2,"likash");
        mk.put(3,"nikhil");
        mk.put(4,"dikhil");


        Set ii=mk.entrySet();
        Iterator it=ii.iterator();
        while(it.hasNext())
        {
          Map.Entry m=(Map.Entry)it.next();
          System.out.println(m.getKey()+ " "+m.getValue());
        
        }
        System.out.println("The Value is: " + mk.get(1));
        System.out.println("The Value is: " + mk.size());
        System.out.println("The Value is: " + mk.hashCode());
        Set<Integer>sc=new HashSet<Integer>();
        sc=mk.keySet();
        System.out.println(sc);
        System.out.println("The collection is: " + mk.values()); 
        System.out.println("contains keys "+mk.containsKey(2)+"conatins values "+mk.containsValue("bikash"));
        

        
    }
    
}
