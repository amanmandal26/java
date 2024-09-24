import java.util.Scanner;
public class Arrange2 {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        int b=0;
        System.out.println("Enter the number in an array");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                a[b]=a[i];
                b++;
            }
        }
        for(int j=0;j<a.length;j++)
        {
            if(a[j]%2!=0)
            {
                a[b]=a[j];
                b++;
            }
        }
        for(int i=0;i<a.length;i++)
        {
           System.out.println(a[i]);
        }

        }
}
