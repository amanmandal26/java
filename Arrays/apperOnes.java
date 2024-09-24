package Arrays;
import java.util.*;
public class apperOnes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        int count=0;
        System.out.println("enter the element");
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++)
        { 
            count=0;
            for(int j=0;j<5;j++)
            {
                if(arr[i]==arr[j])
                count++;
            }
            if(count==1)
        {
        System.out.println("Element that appers once "+arr[i]);
        break;
        }
           
        }
        
    }
   
        
    }
