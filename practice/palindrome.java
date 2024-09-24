import java.util.Scanner;
public class palindrome {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        String rev="";
        for(int i=s.length()-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);
        }
        if(rev.equals(s))
        System.out.println("palindrome");
        else
        System.out.println("Not a palindrome");
    }
}
