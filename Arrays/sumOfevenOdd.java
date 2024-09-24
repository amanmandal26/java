package Arrays;
import java.util.*;
public class sumOfevenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int s=sc.nextInt();
        int arr[]=new int[s];
        int sum=0,sum1=0;
        System.out.println("Enter the elements");
        for(int i=0;i<s;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<s;i++)
        {
            if(arr[i]%2==0)
            sum=sum+arr[i];
            else
            sum1=sum1+arr[i];
        }
        System.err.println("sum of even numbers "+sum);
        System.err.println("sum of odd numbers "+sum1);
    }
}
