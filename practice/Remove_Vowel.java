import java.util.Scanner;
public class Remove_Vowel {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string ");
        String s=sc.nextLine();
        s=s.toLowerCase();
        String s2="";
        for(int i=0;i<s.length();i++)
        {
            char s1=s.charAt(i);
            if(s1=='a'||s1=='e'||s1=='i'||s1=='o'||s1=='u')
            {
               continue; 
            }
            else
            s2=s2+s1;
        }
        System.out.println(s2);
    }
}
