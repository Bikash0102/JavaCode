import java.util.Scanner;

public class Patter12


{

    public static void main(String args[]) 

    {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++)
        { int l=1;
            for(int j=0;j<2*i+1;j++)
            {
                if(j%2==0)
                {
                    System.out.print(l);
                    l++;
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }

}
