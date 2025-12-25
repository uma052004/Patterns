import java.util.*;
public class pattern6 {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter numberr of rows: ");
      int rows=sc.nextInt();
      System.out.println("Enter number of columns: ");
      int cols=sc.nextInt();
      for(int i=rows;i!=0;i--)
      {
        for(int j=1;j<=i;j++)
        {
            System.out.print(j+" ");
        }
        System.out.println();
      }
    
    }
}
