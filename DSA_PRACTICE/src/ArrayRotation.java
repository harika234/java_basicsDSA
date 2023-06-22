import java.util.Arrays;
public class ArrayRotation {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k =2;
        System.out.println("Before Rotating the array :"+ Arrays.toString(arr));
        rotateArray(arr,k);
        System.out.println("After Rotating the array :"+Arrays.toString(arr));
    }
    public static void rotateArray(int[] arr,int k){
        if(arr == null || k<=0){
            return;
        }
        int n =arr.length;
        k = k%n;
        reverseArray(arr,0,n-1);
        reverseArray(arr,0,k-1);
        reverseArray(arr,k,n-1);
    }
    private static void reverseArray(int[] arr,int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}