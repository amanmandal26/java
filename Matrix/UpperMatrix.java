package Matrix;
import java.util.*;
public class UpperMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        System.out.println("Enter the Element");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("--------------------------------------");
        System.out.println("array is:-");
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
                if(j>=i)
                System.out.println(arr[i][j]);
            }
        }
    }
}
