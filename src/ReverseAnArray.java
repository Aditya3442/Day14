import java.util.Arrays;

public class ReverseAnArray {
    public static void reverse(int i,int n,int[] arr){
        if(i>=n/2)
            return;
        int temp=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;
        reverse(i+1,n,arr);
    }
    public static void main(String[] args) {
        int arr[]={1,23,3,4,5,6,7};
        reverse(0,arr.length,arr);
        System.out.println(Arrays.toString(arr));
    }
}
