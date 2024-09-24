package Arrays;
import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // System.out.println("enter the size");
        // int s=sc.nextInt();
        int arr[] =new int[10];
        int p=0,q=0;
        System.out.println("enter the number");
        int no=sc.nextInt();
        while(no>0)
        {
            p=0;
            for(int i=1;i<=no;i++)
            {
                if(no%i==0)
                p++;
            }
            if(p==2)
            {
                arr[q]=no;
                q++;
            }
            no++;
            if(q==10)
            break;
        }
        for(int i=0;i<10;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
