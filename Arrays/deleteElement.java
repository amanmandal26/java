package Arrays;

public class deleteElement {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,8};
        int no=5;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==no)
            {
                for(int j=i;j<arr.length-1;j++)
                {
                   arr[j]=arr[j+1];
                }
            }
        }
        for(int i=0;i<arr.length-1;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
