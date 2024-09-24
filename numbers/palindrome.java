package numbers;
import java.util.*;
public class palindrome {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int no=sc.nextInt();
        int rev=0,rem,no1;
        no1=no;
        while(no1>0){
            rem=no1%10;
            no1=no1/10;
            rev=rev*10+rem;
        }
        if(rev==no)
        System.out.println("palindrome number");
        else
        System.out.println("Not a palindrome number");
    }
}
