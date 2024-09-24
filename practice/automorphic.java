import java.util.Scanner;
public class automorphic {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int no=sc.nextInt();
        int sq=no*no;
        int no1=no;
        int d=1;
        while(no1>0)
        {
           d=d*10;
           no1=no1/10;
        }
        if(sq%d==no)
        System.out.println("Automorphic number");
        else
        System.out.println("Not a Automorphi number");
    }
}
