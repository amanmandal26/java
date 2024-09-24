package numbers;
public class Automorphic {
    public static void main(String [] args)
    {
        int no=5,sq,no1,d=10;
        sq=no*no;
        no1=no;

        while(no1>0)
        {
            no1=no1/10;
            d=d*10;
        }
       if(sq%d==no)
       System.out.println("automorphic number");
       else
       System.out.println("not automorphic number");
    }
}
