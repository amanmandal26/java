package Arrays;
import java.util.*;
public class secondLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("Enter the number");
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            for(int j=i+1;j<5;j++)
            {
                if(arr[i]<arr[j])
                {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                }
            }
        }
        
            System.out.println("Second largest number is "+arr[1]);
        
    }
}
