import java.util.Arrays;

public class leaderInElement {
    public static void main(String[] args) {
        int[] arr = {5, 4};
        System.out.println("given array is : "+ Arrays.toString(arr));
        int[] result = findLeader(arr);
        System.out.println("leaders array is : "+Arrays.toString(result));
    }

    public static int[] findLeader(int[] arr){
        int n = arr.length;
        int max = arr[n-1];
        int count =1;
        for(int i = n-2; i>=0 ; i--){
            if(arr[i] > max){
                max = arr[i];
                count++;
            }
        }
        int[] ans = new int[count];
        max = arr[n-1];
        ans[0] = arr[n-1];
        count = 0;
        for(int i = n-2; i>=0; i--){
            if(arr[i]>max){
                count++;
                ans[count] = arr[i];
                max = arr[i];
            }
        }
        return ans;
    }
}
