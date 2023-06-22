public class SubarraySum {
    public static void main(String args[]){
        int[] arr = {1,2,3};
        int n = arr.length;
        long sum = 0;
        for(int i=0;i<n;i++){
            sum+=(long)arr[i]*(i+1)*(n-i);
        }
        System.out.println(sum);
    
    }
}
