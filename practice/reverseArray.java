import java.util.Scanner;
public class reverseArray {
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    int a[]=new int[5];
    System.out.println("Enter the value in Array");
    for(int i=0;i<a.length;i++)
    {
        a[i]=sc.nextInt();
    }
    for(int i=a.length-1;i>=0;i--)
    {
        System.out.print(a[i]);
    }
  } 
}
