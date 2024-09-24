package Arrays;
import java.util.*;
public class duplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        int p=0;
        System.out.println("enter the number");
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            for(int j=i+1;j<5;j++)
            {
                if(arr[i]==arr[j])
            {
                p++;
                System.out.println("Duplicate element is "+arr[i]);
                break;
            }
            }
           
        }
        
    }
}
