package numbers;
import java.util.*;
public class armstrong {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int no=sc.nextInt();
        int count=0,rem,sum=0;
        int no1=no;
        while(no1>0)
        {
            no1=no1/10;
            count++;
        }
        int no2=no;
        while(no2>0)
        {
            rem=no2%10;
            no2=no2/10;
           int arm=1;
           int c=count;
           while(c>0)
           {
            arm=arm*rem;
            c--;
           }
           sum=sum+arm;

        }
        if(sum==no)
        System.out.println("Armstrong number");
        else
        System.out.println("Not a Armstrong Number");
    }
}
