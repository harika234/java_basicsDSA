import java.util.Arrays;

public class ReverseTheArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int start = 0;
        int end = 4;
        System.out.println("Before Reversing "+ Arrays.toString(arr));
        reverseArray(arr,start,end);
        System.out.println("After Reversing " + Arrays.toString(arr));
    }

    public static void reverseArray(int[] arr,int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

    }
}
