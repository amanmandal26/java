import java.util.Scanner;
public class max_min {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Enter the number in the array");
        for(int i=0;i<a.length;i++)
        {
            a[i] = sc.nextInt();
        }
        int max=a[0];
        int min=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println("Maximum number in array is : "+max);
        System.out.println("Minimum number in an array is : "+min);
    }
}
