public class Longist_palindrome {
    public static void main(String [] args)
    {
        int a[]={123,234,1212121,161,1771};
        int b[]=new int[5];
        int rem,rev=0;
        java.util.Arrays.sort(a);
        //123,161,234,1771
        for(int i=a.length-1;i>=0;i--)
        {
            b[i]=a[i];
          while(b[i]>0)
          {
            rem=b[i]%10;
            b[i]=b[i]/10;
            rev=rev*10+rem;
          }
          if(rev==a[i])
          System.out.println("biggest palindrome is "+a[i]);
        }

    }
}
