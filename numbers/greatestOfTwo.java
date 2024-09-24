package numbers;
import java.util.*;
public class greatestOfTwo {
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first number");
    int no1=sc.nextInt();
    System.out.println("Enter the Second number");
    int no2=sc.nextInt();
    if(no1>no2)
    System.out.println(no1+" is greater");
    else
    System.out.println(no2+" is greater");
   } 
}
