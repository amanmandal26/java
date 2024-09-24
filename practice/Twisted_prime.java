import java.util.Scanner;
public class Twisted_prime {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int no=sc.nextInt();
        int no1=no;
        int rem,rev=0,p=0,q=0;
        while(no1>0)
        {
            rem=no1%10;
            no1=no1/10;
            rev=(rev*10)+rem;
        }
        System.out.println(rev);
       for(int i=1;i<=no;i++)
       {
        if(no%i==0)
        p++;
       }
      
       for(int i=1;i<=rev;i++)
       {
        if(no%i==0)
        q++;
       }
       if(p==2 && q==2)
       System.out.println("twisted prime");
       else
       System.out.println("Not a Twisted prime");
    }
}
