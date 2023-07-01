package ArrayInterviewProb_2;

import java.util.Arrays;

public class SumOfEvenIndeces {
    public static void main(String args[]){
        int[] a = {1,2,3,4,5};
        int[][] b = {{0,2},{1,4}};

        int[] ans = find_sum_even_indexes(a,b);
        System.out.println(Arrays.toString(ans));
    }

    public static  int[] find_sum_even_indexes(int[] a, int[][] b){
        int[] pf_sum = new int[a.length];
        pf_sum[0] = a[0];

        for(int i = 1;i < a.length; i++){
            if(i%2 == 0){
                pf_sum[i] = pf_sum[i-1]+a[i];
            }
            else{
                pf_sum[i] = pf_sum[i-1];
            }
        }

        int[] result = new int[b.length];
        for(int i = 0;i<b.length;i++){
            int left = b[i][0];
            int right = b[i][1];


            if (left == 0){
                result[i] = pf_sum[right];
            }
            else{
                result[i] = pf_sum[right] - pf_sum[left-1];
            }
        }
        return  result;

    }
}
