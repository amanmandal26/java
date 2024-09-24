import java.util.Scanner;
public class M_K_Gandhi {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        s=s.toUpperCase();
        s=' '+s;
        int pos=s.lastIndexOf(' ');
        for(int i=0;i<pos;i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                System.out.print(s.charAt(i+1)+".");
            }

        }
        System.out.print(s.substring(pos));
    }
}
