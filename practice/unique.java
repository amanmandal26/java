public class unique {
    public static void main(String [] args)
    {
        int a[]={1,2,3,1,2};
        int p=0;
        for(int i=0;i<a.length;i++)
        {
            p=0;
            for(int j=0;j<a.length;j++)
            {
                if(a[i]==a[j])
                p++;
            }
            if(p==1)
            System.out.println(a[i]);
        }
       

    }
}
