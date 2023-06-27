package ArrayInterviewProblms_1;

import java.util.Arrays;
import java.util.Scanner;

public class OddEvenNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        int[] ans = countoddeven(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] countoddeven(int[] arr){
        int[] op = new int[2];
        int n = arr.length;
        int even_sum = 0;
        int odd_sum=0;
        for(int i = 0;i < n;i++){
            if(i%2==0){
                even_sum = even_sum+arr[i];
            }
            if(i%2!=0){
                odd_sum=odd_sum;
            }
            op[0]=even_sum;
            op[1]=odd_sum;
        }
        return op;
    }
}
