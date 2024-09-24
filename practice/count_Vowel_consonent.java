import java.util.Scanner;
public class count_Vowel_consonent {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s= sc.nextLine();
        int count=0, flag=0, p=0;
        for(int i=0;i<s.length();i++)
        {
            char s1= s.charAt(i);
            if(s1=='a'||s1=='e'||s1=='i'||s1=='o'||s1=='u')
              count++;
            else if(s1==' ')
             p++;
            else
            flag++;
        }
        System.out.println("Vowels are "+count);
        System.out.println("Consonents are "+flag);
    }
}
