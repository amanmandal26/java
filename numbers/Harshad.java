package numbers;
public class Harshad {
   public static void main(String[] args) {
    int no=24;
    int no1,rem,sum=0;
    no1=no;
    while(no1>0)
    {
        rem=no1%10;
        no1=no1/10;
        sum=sum+rem;
    }
    if(no%sum==0)
    System.out.println("Harshed number");
    else
    System.out.println("Not a Harshed Number");
   }

}
