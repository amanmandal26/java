import java.util.Scanner;
public class ascii {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character");
        char c= sc.next().charAt(0);
        int i=c;
        System.out.println("Ascii value of "+c+"="+i);
    }
    
}
