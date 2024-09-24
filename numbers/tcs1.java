package numbers;
import java.util.*;
public class tcs1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int [] arr = new int[n];
        int [] arr2 =new int [n];
        System.out.println("Enter the elements in array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
       for(int i=0;i<n-1;i++)
       {
         if(arr[i]==0)
         {
           for(int j=i;j<n-1;j++)
           {
            arr[j]=arr[j+1];
           }
           arr[n-1]=0;
         }
       }
       for(int i=0;i<n;i++){
       
        System.out.println(arr[i]);
       }
    }
}
