import java.util.Arrays;

public class reverseArray {
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5};
        System.out.println("original array is "+Arrays.toString(arr));
        reverse(arr,0,arr.length-1);
        System.out.println("reversed array is "+ Arrays.toString(arr));
    }

    public static void reverse(int[] arr,int start,int end){
        if(start>=end){
            return;
        }
        else{
            //swap elements
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            reverse(arr,start+1,end-1);
        }

    }


}
