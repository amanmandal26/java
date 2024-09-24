import java.util.Scanner;
public class Remove_space {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the String ");
        String s=sc.nextLine();
        String s2="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            continue;
            else
            s2=s2+ch;
        }
        System.out.println(s2);
    }
}
