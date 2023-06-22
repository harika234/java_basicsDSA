public class GoodSubarraysEasy {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int B = 4;
        int op = goodsubarrayeasy(arr,B);
        System.out.println(op);
    }
    public static int goodsubarrayeasy(int[] arr, int B){
        int n = arr.length;
        int ans = 0;
        int[] pfsum = new int[n];
        for(int i=1;i<n;i++){
            pfsum[i]=pfsum[i-1]+arr[i];
        }
        for(int i = 0;i<n;i++){
            for(int j = i;j<n;j++){
                int sz = j-i+1;
                int sum;
                if(i==0){
                    sum = pfsum[j];
                }
                else{
                    sum = pfsum[j]-pfsum[i-1];
                }
                if(sz%2==0 && sum <B){
                    ans++;
                }
                if(sz%2!=0 && sum>B){
                    ans++;
                }
            }
        }
        return ans;
    }
}
