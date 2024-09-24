import java.util.Scanner;
public class frequency2 {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int no=sc.nextInt();
         int rem,count=0;
        for(int i=0;i<=9;i++)
        {
            int no1=no;
            count=0;
            while(no1>0)
            {
              rem=no1%10;
              no1=no1/10;
              if(rem==i)
              count++;
            }
            if(count!=0)
            System.out.println("frequency of "+i+"="+count);
        }
    }
}
