import java.util.Scanner;
public class numbr_unique {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int no=sc.nextInt();
        int rem,p=0,q=0;
        for(int i=0;i<=9;i++)
        {
            int no1=no;
            while(no1>0)
            {
              rem=no1%10;
              no1=no1/10;
              if(rem==i)
               p++;
            }
            if(p>1)
            {
                q=1;
                break;
            }
            p=0;
        }
        if(q==1)
        System.out.println("Not a unique number");
        else
        System.out.println("Unique number ");
    }
}
