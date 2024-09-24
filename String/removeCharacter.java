package String;
import java.util.*;
public class removeCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s =sc.nextLine();
        int pos=s.lastIndexOf('m');
        for(int i=0;i<pos;i++)
        {
            System.out.print(s.charAt(i));
           
        }
        System.out.print(s.substring(pos+1));
    }
}
