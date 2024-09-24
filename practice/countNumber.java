import java.util.Scanner;
public class countNumber {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        String s2="";
        int count=0;

        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
            count++;
            continue;
            }
            else
            s2=s2+s.charAt(i);
        }
        System.out.println(count);
        System.out.println(s2);
    }
}
