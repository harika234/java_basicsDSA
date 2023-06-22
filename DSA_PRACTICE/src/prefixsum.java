import java.util.Arrays;

public class prefixsum {
    public static void main(String args[]){
        int[] arr={1,2,3,4,5};
        System.out.println("original array"+ Arrays.toString(arr));
        int[] res = prefixsum(arr);
        System.out.println("prefix array : "+Arrays.toString(res));
    }
    public static int[] prefixsum(int[] arr){
        int n = 5;
        int[] pfsum = new int[5];
        pfsum[0]=arr[0];
        for(int i=1;i<5;i++){
            pfsum[i]=pfsum[i-1]+arr[i];
        }
        return pfsum;
    }
}
