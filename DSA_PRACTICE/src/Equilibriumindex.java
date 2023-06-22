import java.util.Arrays;

public class Equilibriumindex {
    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println("given array : "+ Arrays.toString(arr));
        int res = find_equilibrium_index(arr);
        System.out.println(res);
    }
    public static int find_equilibrium_index(int[] arr){
        int n = arr.length;
        int[] pfsum = new int[n];

        pfsum[0]=arr[0];
        for(int i=1;i<n;i++){
            pfsum[i]=pfsum[i-1]+arr[i];
        }

        for(int i=0;i<n;i++){
            int leftsum = 0;
            int rightsum =0;

            if(i==0){
                leftsum =0;
            }
            else{
                leftsum = pfsum[i-1];
            }

            if(i==6){
                rightsum=0;
            }
            else{
                rightsum=pfsum[n-1]-pfsum[i];
            }

            if(leftsum==rightsum) return i;
        }
        return -1;
    }
}
