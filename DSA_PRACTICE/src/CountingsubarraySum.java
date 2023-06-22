import java.util.Arrays;

public class CountingsubarraySum {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6};
        int B = 10;
        int op = subarrsum(arr,B);
        System.out.println(op);
    }

    public static int subarrsum(int[] arr,int B){
        int n = arr.length;
        int[] pfsum = new int[n];
        pfsum[0]=arr[0];
        for(int i=1;i<n;i++){
            pfsum[i]=pfsum[i-1]+arr[i];
        }
        int count = 0;
        for(int i = 0;i <n;i++){
            for(int j=i;j<n;j++){
                int sum;
                if(i==0){
                    sum = pfsum[j];
                }
                else{
                    sum = pfsum[j]-pfsum[i-1];
                }

                if(sum<B){
                    count++;
                }
            }
        }
        return count;
    }
}
