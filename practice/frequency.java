public class frequency {
    public static void main(String [] args)
    {
        int a[]={10,20,30,40,10,20,30};
        //sort the array
        java.util.Arrays.sort(a);
       int current_element=a[0];
       int frequency=1;
       for(int i=1;i<a.length;i++)
       {
           if(a[i]==current_element)
             frequency++;
             else
             {
                System.out.println("frequency of "+current_element+"="+frequency);
             current_element=a[i];
             frequency=1;
             }
       }
       System.out.println("freuency of last element is "+current_element+"="+frequency);
    }
}
