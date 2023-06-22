public class maximumSubarraySum {
    public static void main(String[] args) {
        int A = 5;
        int B = 12;
        int[] arr = {2, 1, 3, 4, 5};
        int res = subarraySum(A,B,arr);
        System.out.println(res);
    }

    public static int subarraySum(int A,int B,int[] arr){
//        int j = 0;
        int ans = 0;
        for(int i=0;i<A;i++){
            int sum = 0;
            for(int j=i;j<A;j++){
                sum = sum+arr[j];
                if(sum>ans && sum<=B){
                    ans = sum;
                }
            }
        }
        return ans;
    }
}
