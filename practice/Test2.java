import java.util.Scanner;
public class Test2 {
 public static void main(String [] args)
 { 
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number");
    int no=sc.nextInt();
    System.out.println("Enter the power");
    int power=sc.nextInt();
    int res=1;
    while(power>0)
    {
        res=res*no;
        power--;
    }
   System.out.println(res);
 }   
}
