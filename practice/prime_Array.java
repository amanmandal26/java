import java.util.Scanner;
class prime_Array{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int no=sc.nextInt();
        int a[]=new int[10];
        int p=0,b=0;
        while(no>0)
        {
            p=0;
            for(int i=1;i<=no;i++)
            {
                if(no%i==0)
                p++;
            }
            if(p==2)
            {
                a[b]=no;
                b++;
            }
            no++;

            if(b==10)
            break;

        }
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}