import java.util.*;
public class pattern11 {
       public static void main(String args[])
       {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows=sc.nextInt();
        System.out.println("Enter number of cols:");
        int cols=sc.nextInt();
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=i;j++)
            {  
                int sum=i+j;
                if(sum%2==0)
                {
                  System.out.print("1");
                }
                else
                {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
       }
}
