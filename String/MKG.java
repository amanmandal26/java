package String;
import java.util.*;
public class MKG {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        s=' '+s;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            System.out.print(s.charAt(i+1)+".");
        }
    }
}
