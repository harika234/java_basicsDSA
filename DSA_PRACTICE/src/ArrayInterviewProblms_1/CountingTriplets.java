package ArrayInterviewProblms_1;

public class CountingTriplets {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3};
        int ans = countTriplets(arr);
        System.out.println(ans);
    }

    public static int countTriplets(int[] arr){
        int n = arr.length;
        int ans = 0;
        for(int i = 1;i < n; i++){
            int l = 0;
            int r = 0;
            for(int j=0;j<i;j++){
                if(arr[j]<arr[i]){
                    l++;
                }
            }
            for(int k = i+1;k<n;k++){
                if(arr[k]>arr[i]){
                    r++;
                }
            }
            ans = ans +(l*r);
        }
        return ans;
    }
}
