package String;
import java.util.*;
public class sumOfNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isDigit(ch))

            sum=sum+Character.getNumericValue(ch);
        }
        System.out.println(sum);
    }
}
