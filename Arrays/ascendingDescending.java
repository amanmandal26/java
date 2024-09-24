package Arrays;
public class ascendingDescending {
      public static void main(String[] args) {
        int arr[]={1,3,2,5,6,9,7,8,4,10};
        int a=0,b=arr.length-1;
        int mid=(a+b)/2;
        for(int i=0;i<=mid;i++)
        {
          for(int j=i+1;j<=mid;j++)
          {
            if(arr[i]>arr[j])
            {
              int temp=arr[i];
              arr[i]=arr[j];
              arr[j]=temp;
            }
          }
        }
        for(int i=0;i<=mid;i++)
        {
          System.out.println(arr[i]);
        }

        for(int i=mid+1;i<b;i++)
        {
          for(int j=i+1;j<b;j++)
          {
            if(arr[i]<arr[j])
            {
              int temp=arr[i];
              arr[i]=arr[j];
              arr[j]=temp;
            }
          }
        }
        for(int i=mid+1;i<b;i++)
        {
          System.out.println(arr[i]);
        }


      }
    
}