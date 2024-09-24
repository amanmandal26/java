import java.util.Scanner;
public class Remove_special {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String ");
        String s=sc.nextLine();
        String s2=""; 
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>=65 && ch<=90 || ch>=97 && ch<=122)
            s2=s2+ch;
            else
            continue;
        }
        System.out.println(s2);
    }
}
