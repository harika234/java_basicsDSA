import java.util.Arrays;

public class ReverseInaRange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int start = 2;
        int end = 4;

        System.out.println("Before Reversing: "+ Arrays.toString(arr));
        reverseinrange(arr,start,end);
        System.out.println("After Reversing: "+ Arrays.toString(arr));
    }
    public static void reverseinrange(int[] arr,int start,int end){
        if(arr==null){
            return;
        }
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
