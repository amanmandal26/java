package String;
import java.util.*;
public class countVowelConsonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        s=s.toLowerCase();
        int count=0,p=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                count++;
            }
            else
            p++;
        }
        System.out.println("vowels are " +count);
        System.out.println("Consonent are " + p);

    }
}
