package numbers;
import java.util.*;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Binary Number");
        int no=sc.nextInt();
        int i=0,rem,n1,d=0;
        n1=no;
        while(n1>0)
        {
            rem=n1%10;
            n1=n1/10;
             d= d+rem*(int)Math.pow(2,i);
             i++;
        }

        System.out.println("Decimal is"+d);



    }
}
