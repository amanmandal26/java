public class pattern10 {
    public static void main(String [] args)
    {
        int i,j,sp;
        for(i=1;i<=5;i++)
        {
            for(sp=4;sp>=i;sp--)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=1;i<=4;i++)
        {
              for(sp=1;sp<=i;sp++)
              {
                System.out.print(" ");
              }
              for(j=4;j>=i;j--)
              {
                System.out.print("*");
              }
              System.out.println();
        }

    }
}
