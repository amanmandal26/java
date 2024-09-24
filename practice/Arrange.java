import java.util.Scanner;
public class Arrange {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int a[] =new int[10];
        int b[] =new int[10];
        int q=0;
        System.out.println("Enter the number in the Array");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                b[q]=a[i];
                q++;
            }
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2!=0)
            {
                b[q]=a[i];
                q++;
            }
        }
        for(int i=0;i<b.length;i++)
        {
        System.out.println(b[i]);
        }
    }
}
