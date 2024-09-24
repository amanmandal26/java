import java.util.Scanner;
public class frequencyString {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String ");
        String s= sc.nextLine();
        int count=0;
        s=s.toLowerCase();
        for(char ch='a';ch<='z';ch++)
        {
            count=0;
            for(int i=0;i<s.length();i++)
            {
                char ch1=s.charAt(i);
                if(ch==ch1)
                count++;
            }
            if(count!=0)
            System.out.println("frequency of "+ch+"="+count);
        }
    }
}
