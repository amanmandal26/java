package Arrays;
import java.util.*;
public class max_min {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int s=sc.nextInt();
        int arr[]=new int[s];
        System.out.println("Enter the elements");
        for(int i=0;i<s;i++)
        {
           arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<s;i++)
        {
            if(max<arr[i])
            max=arr[i];
        }
        for(int i=0;i<s;i++)
        {
           if(min>arr[i])
           min=arr[i];
        }
        System.out.println("max value is "+max);
        System.out.println("min value is "+min);

    }
}
