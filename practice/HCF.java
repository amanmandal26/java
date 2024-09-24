import java.util.Scanner;
public class HCF {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int no1=sc.nextInt();
        System.out.println("Enter the Second numbar");
        int no2=sc.nextInt();
        int min,hcf=0;
        if(no1<no2)
         min=no1;
        else
        min=no2;
        for(int i=1;i<=min;i++)
        {
            if(no1%i==0 && no2%i==0)
            hcf=i;
        }
        System.out.println(hcf);
        int lcm=no1*no2/hcf;
        System.out.println(lcm);
    }
}
