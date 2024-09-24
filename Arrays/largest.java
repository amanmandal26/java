package Arrays;
import java.util.*;
public class largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        System.out.println("Enter the Element in an array");
        int arr[]=new int[size];
        int max=0;
        for(int i=0;i<size;i++)
        {
             arr[i]=sc.nextInt();
        }
        max=arr[0];
        for(int i=0;i<size;i++)
        {
            if(max < arr[i])
            max=arr[i];
        }
        System.out.println("largest Element is "+max);
    }
}
