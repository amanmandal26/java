package Arrays;
import java.util.*;
public class min {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int size=sc.nextInt();
        int arr[]=new int[size];
        int min=0;
        System.out.println("enter the Element");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        min=arr[0];
        for(int i=0;i<size;i++)
        {
            if(min>arr[i])
            min=arr[i];
        }
        System.out.println("minimum value is "+min);
    }
}
