import java.util.Scanner;
public class twin_prime {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int no1=sc.nextInt();
        System.out.println("Enter the second number");
        int no2=sc.nextInt();
        int p=0,q=0;
        if(no1-no2==2 || no2-no1==2)
        {
          for(int i=1;i<=no1;i++)
          {
           
            if(no1%i==0)
            p++;
          }
          for(int i=1;i<=no2;i++)
          {
           
            if(no2%i==0)
            q++;
          }
        }
        if(p==2 && q==2)
        System.out.println("Twin prime");
        else
        System.out.println("Not twin prime");
    }
}
