import java.util.Scanner;
public class sumOfColon {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int a[][]=new int[2][2];
        System.out.println("Enter the number in array");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Your array is :");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
               System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
               sum=sum+a[j][i];
            }
            System.out.println("Sum of each column is "+sum);
            sum=0;
        }
    }
    
}
