package String;
import java.util.*;

public class removeSpace {
 
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s= sc.nextLine();
        String s1="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            continue;
            else
            s1=s1+ch;
        }
        System.out.println(s1);
    }
    
}