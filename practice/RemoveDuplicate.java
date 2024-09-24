import java.util.Scanner;
public class RemoveDuplicate {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s= sc.nextLine();
        char previouschar=' ';
        String s2="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=previouschar)
            { 
                s2=s2+s.charAt(i);
                previouschar=s.charAt(i);

            }
        }
        System.out.println(s2);
    }

}
