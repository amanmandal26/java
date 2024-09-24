import java.util.Scanner;
public class sumOfEven_sumOfOdd {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        int sum1=0,sum2=0;
        System.out.println("Enter the value in array");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            sum1=sum1+a[i];
            else
            sum2=sum2+a[i];
        }
        System.out.println("Sum of even numbers is:"+sum1);
        System.err.println("Sum of odd numbers is : "+sum2);
    }
}
