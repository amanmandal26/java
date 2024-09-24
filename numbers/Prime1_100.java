package numbers;
public class Prime1_100 {
    public static void main(String[] args){
       int i,j,p=0;
       for(i=1;i<=100;i++) {
        p=0;
        for(j=1;j<=i;j++){
            if(i%j==0)
            p++;
        }
        if(p==2)
        System.out.println(i);
        else
        p=0;
       }
    }
}
