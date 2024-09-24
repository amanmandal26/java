package String;
import java.util.*;
public class removeRepeating {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s= sc.nextLine();
        String s1="";
        char prevchar=' ';
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(prevchar!=ch)
            {
                s1=s1+ch;
                prevchar=ch;
            }
        }

    System.out.println(s1);
    }
}
