import java.util.Scanner;
public class karpakar {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int no = sc.nextInt();
        int sq=no*no;
        int d=1;
        int no1=no;
        while(no1>0)
        {
            d=d*10;
            no1=no1/10;
        }
        int x=sq%d;
        int y=sq/d;
        if((x+y)==no)
        System.out.println("karpakar number");
        else
        System.out.println("Not a karpakr number");
    }
}
