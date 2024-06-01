/* Online Java Compiler and Editor */

  class Myexception extends Exception
  {
      public Myexception(String s)
      {
          super(s);
      }
  }
  public class CustomException
  {
     public static void main(String []args){
         try
         {
             if(n==2)
             {
             throw new Myexception("Brain out of bound");
             }
         }
         catch(Myexception e)
         {
             System.out.println(e.getMessage());
         }
     }
}
