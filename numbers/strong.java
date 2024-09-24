package numbers;
import java.util.*;
public class strong {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int no=sc.nextInt();
        int no1,rem,fact=1,sum=0;
        no1=no;
        while(no1>0)
        {
            rem=no1%10;
            no1=no1/10;
            for(int i=rem;i>=1;i--)
            {
                fact=fact*i;
            }
            sum=sum+fact;
            fact=1;
        }
        if(sum==no)
        System.out.println("Strong Number");
        else
        System.out.println("Not a Strong Number");
    }
}
