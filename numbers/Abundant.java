package numbers;
public class Abundant {
    public static void main(String[] args) {
        int no=12,sum=0;
        for(int i=1;i<no;i++)
        {
            if(no%i==0)
            sum=sum+i;
        }
        if(sum>no)
        System.out.println("Abundant Number");
        else
        System.out.println("Not a Abundant Number");
    }
}
