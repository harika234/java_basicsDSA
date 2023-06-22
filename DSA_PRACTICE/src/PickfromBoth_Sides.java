public class PickfromBoth_Sides {
    public static void main(String[] args) {
        int[] A = {5, -2, 3 , 1, 2};
        int B = 3;
        int ans = maxsum(A,B);
        System.out.println(ans);
    }
    public static int maxsum(int[] A, int B){
        int n = A.length;
        int ans = Integer.MIN_VALUE;
        int curr_sum = 0;
        for(int i=0;i<B;i++){
            curr_sum=curr_sum+A[i];
        }
        int back = B-1;
        ans = Math.max(ans,curr_sum);
        for(int j=n-1;j>=(n-B);j--){
            curr_sum=curr_sum+A[j];
            curr_sum=curr_sum-back;
            back--;
            ans = Math.max(ans,curr_sum);
        }
        return ans;
    }
}
