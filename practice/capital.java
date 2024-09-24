import java.util.Scanner;
public class capital {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        s=' '+s;
        String s1="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
           if(ch ==' ')
           {
            s1=s1+ch;
            i++;
            ch=s.charAt(i);
            s1=s1+Character.toUpperCase(ch);
           }
           else{
            s1=s1+ch;
           }
        }
        System.out.print(s1);
       
    }
}
