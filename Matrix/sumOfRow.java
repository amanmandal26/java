package Matrix;
import java.util.*;
public class sumOfRow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        int sum=0;
        System.out.println("Enter the numbers");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("--------------------------------------");
        System.out.println("Array is");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
               
                System.out.println(arr[i][j]);
            }
        }
        System.out.println("--------------------------------------");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
               sum=sum+arr[i][j] ;
            }
            System.out.println(sum);
            sum=0;
        }
       
    }
}
