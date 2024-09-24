package numbers;
public class reverse {
    public static void main(String[] args){
        int no=12345;
        int rev=0,rem;
        int no1=no;
        while(no1>0)
        {
          rem=no1%10;
          no1=no1/10;
          rev=rev*10+rem;
        }
        System.out.println(rev);
    }
}
