package Arrays;
import java.util.*;
public class arrange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        int arr1[]=new int[10];
        int q=0;
        System.out.println("enter the number");
        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++)
        {
            if(arr[i]%2==0)
            {
               arr1[q]=arr[i];
               q++;

            }
        }
        for(int i=0;i<10;i++)
        {
            if(arr[i]%2!=0)
            {
               arr1[q]=arr[i];
               q++;

            }
        }
        for(int i=0;i<10;i++)
        {
            System.out.println(arr1[i]);
        }
    }
}
