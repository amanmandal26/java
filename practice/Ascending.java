import java.util.Scanner;
public class Ascending {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int no=sc.nextInt();
        int rem;
        for(int i=0;i<=9;i++)
        {
            int no1=no;
            while(no1>0)
            {
                rem=no1%10;
                no1=no1/10;
            if(rem==i)
             System.out.println(i);
            }
        }
    }
}
