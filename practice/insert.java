public class insert {
    public static void main(String [] args)
    {
        int a[]={10,20,30,50,60};
        int data =40;
        int pos=4;
        for(int i=a.length-1;i>pos-1;i--)
        {
           a[i]=a[i-1];
        }
        a[pos-1]=data;
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
