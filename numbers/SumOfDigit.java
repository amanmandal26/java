package numbers;
import java.util.*;
public class SumOfDigit {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int no=sc.nextInt();
        int rem,sum=0;
        int no1=no;
        while(no1>0){
            rem=no1%10;
            no1=no1/10;
            sum=sum+rem;
        }
        System.out.println(sum);

    }
}
