package String;
import java.util.*;
public class unique {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);

            for(int j=i+1;j<s.length();j++)
            {
                char ch1=s.charAt(j);
                if(ch==ch1)
                {
                count++;
                break;
                }
            }
        }
        if(count>=1)
        System.out.println("Not Unique");
        else
        System.out.println("Unique");
    }
}
