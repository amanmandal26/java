package Arrays;

public class mergeArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int arr2[]={6,7,8,9,10};
        int len=arr.length;
        int len2=arr2.length;
        int len3=len+len2;
        int arr3[]=new int[len3];
        for(int i=0;i<len;i++)
        {
          arr3[i]=arr[i];
        }
        for(int i=0;i<len2;i++)
        {
          arr3[len+i]=arr2[i];
        }
        for(int i=0;i<len3;i++)
        {
         System.out.println(arr3[i]);
        }
    }
}
