public class Duplicate {
    public static void main(String [] args)
    {
        int a[]={1,2,3,4,5,2,3,5};
        int temp=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
              if(a[i]==a[j])
              {
              System.out.println("First Dupliacte : "+a[i]);
              temp=temp+1;
              break;
              }
              
            }
           if(temp>0)
           break;
           
        }
    }
}
