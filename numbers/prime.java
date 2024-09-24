package numbers;
import java.util.*;
public class prime {
    public static void main(String [] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number");
    int no=sc.nextInt();
    int p=0;
    for(int i=1 ; i<=no ; i++){
       if(no%i==0)
       p++;
    }
    if(p==2)
    System.out.println(no+" is Prime number");
    else
    System.out.println(no+" is Not Prime number");
    }
}
