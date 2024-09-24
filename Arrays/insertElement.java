package Arrays;

import String.length;

public class insertElement {
    public static void main(String[] args) {
        int arr[]={2,3,4,6,7,8};
        int pos=4;
        int no=5;
        for(int i=arr.length-1;i>pos-1;i--)
        {
              arr[i]=arr[i-1];
        }
        arr[pos-1]=no;
        for(int i=0;i<arr.length;i++)
        {
          System.out.println(arr[i]);
        }
    }
}
