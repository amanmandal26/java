package Arrays;

public class commenElement {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6};
        int arr1[]={1,5,10, 3,20};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr1.length;j++)
            {
                if(arr[i]==arr1[j])
                {
                    System.out.println("Commen element is "+arr[i]);
                }
            }
        }
    }
}
