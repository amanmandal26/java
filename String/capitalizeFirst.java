package String;
import java.util.*;
public class capitalizeFirst {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String");
        String s= sc.nextLine();
        String s1="";
        s=' '+s;

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                s1=s1+ch;
                i++;
                ch=s.charAt(i);
                s1=s1+Character.toUpperCase(ch);
            }
            else
            s1=s1+ch;
        }
        System.out.println(s1);
    }
}
