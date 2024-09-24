import java.util.Scanner;
public class karamchand_gandhi_mohandas {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        int pos=s.indexOf(' ');
        for(int i=pos;i<s.length();i++)
        {
           System.out.print(s.charAt(i));
        }
        System.out.print(" "+s.substring(0,pos));
    }
}
