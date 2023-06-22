import java.util.Arrays;

public class SubarrayInGivenRange {
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5};
        int B = 2;
        int C = 4;
        int[] op = subarray(arr,B,C);
        System.out.println("subarray in the given range : "+ Arrays.toString(op));
    }

    public static int[] subarray(int[] arr,int B,int C){
        int n = arr.length;
        int[] ans = new int[C-B+1];
        int j =0;
        for(int i=B;i<=C;i++){
            ans[j]=arr[i];
            j++;
        }
        return ans;
    }
}
