import java.util.Scanner;
class Test{
    public static void main (String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the value of b");
     int b=sc.nextInt();
     System.out.println("Enter the value of h");
     int h=sc.nextInt();
     int area=(b*h)/2;
     System.out.println("Area of Triangle is : "+area);
    
    }
}