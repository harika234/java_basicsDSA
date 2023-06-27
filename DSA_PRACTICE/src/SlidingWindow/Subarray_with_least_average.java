package SlidingWindow;

public class Subarray_with_least_average {
    public static void main(String[] args) {
        int[] arr = {3, 7, 90, 20, 10, 50, 40};
        int B = 3;
        int ans = subarr_leastaverage(arr,B);
        System.out.println(ans);
    }
    public static int subarr_leastaverage(int[] arr, int B){
        int n = arr.length;
        int sum = 0;
        int ans = 0;
        for(int i = 0;i < B;i++){
            sum+=arr[i];
        }
        int least_sum = sum;
        int start_index = 1;
        int end_index = B;
        while(end_index<n){
            sum = sum+arr[end_index]-arr[start_index-1];
            if(sum<least_sum){
                least_sum = sum;
                ans = start_index;
            }
            start_index++;
            end_index++;
        }
        return ans;
    }
}
