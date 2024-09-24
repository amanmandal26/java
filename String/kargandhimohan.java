package String;
import java.util.*;
public class kargandhimohan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        String s1="";
       int pos=s.indexOf(' ');
       for(int i=pos;i<s.length();i++)
       {
        System.out.print(s.charAt(i));
       }
       System.out.print(" "+s.substring(0, pos));
    }
}
