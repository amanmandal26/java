package String;
import java.util.*;
public class nonrepeting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        String s1="";
        for(int i=0;i<s.length();i++)
        {
            int count=0;
            char ch=s.charAt(i);

            for(int j=0;j<s.length();j++)
            {
                char ch1=s.charAt(j);
                if(ch==ch1)
                {
                   count++;
                }
                
            }
            if(count==1)
           System.out.print(ch);
        }
        
    }
}
