package numbers;
public class perfect {
    public static void main(String [] args){
        int no=28,sum=0;
        for(int i=1;i<no;i++)
        {
            if(no%i==0)
            {
                sum=sum+i;
            }

        }
        if(sum==no)
        System.out.println("Perfect Number");
        else
        System.out.println("not a perfect number");
    }
}
