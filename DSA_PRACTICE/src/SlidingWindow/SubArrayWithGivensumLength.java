package SlidingWindow;
import java.util.*;

public class SubArrayWithGivensumLength {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int B = 3;
        int C = 8;
        int op = subarray(arr,B,C);
        System.out.println(op);
    }
    public static int subarray(int[] arr,int B,int C){
//        int n = arr.length;
        int sum = 0;
        for(int i = 0;i<=B-1;i++) {
            sum = sum + arr[i];
        }
        if(sum == C){
            return 1;
        }
        for(int i = B;i<arr.length;i++){
            sum = sum + arr[i]-arr[i-B];
            if(sum == C){
                return  1;
            }
        }
        return 0;
    }
}
