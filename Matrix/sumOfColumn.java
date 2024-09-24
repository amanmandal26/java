package Matrix;
import java.util.*;
public class sumOfColumn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int sum=0;
        int arr[][]=new int[m][n];
        System.out.println("Enter the Elements");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("-------------------------------");
        System.out.println("Array is");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
               System.out.println(arr[i][j]);
            }
        }

        System.out.println("-------------------------------");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
               sum=sum+arr[j][i];
            }
            System.out.println(sum);
            sum=0;
        }
    }
}
