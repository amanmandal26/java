import java.util.Scanner;
public class min {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int [] a=new int[5];
        System.out.println("Enter the number in The array");
        for(int i=0;i<a.length;i++)
        {
             a[i]=sc.nextInt();
        }
 
        int min=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(min>a[i])
            {
                min=a[i];
            }
        }
        System.out.println("Minimum number in the array is : "+min);
    }
}
