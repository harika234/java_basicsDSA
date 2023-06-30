package ArrayInterviewProblms_1;

import java.util.Arrays;
import java.util.Scanner;

public class maximumPositivity {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i]= scn.nextInt();
        }

        int[] op = maxpos(arr);
//        System.out.println(Arrays.toString(op));
        for(int i = 0;i<op.length;i++){
            System.out.print(op[i]+" ");
        }
    }
    public static int[] maxpos(int[] A){
        int pos_elem = 0;
        int max_count_index = 0;
        int max_count = Integer.MIN_VALUE;

        for(int i=0;i<A.length;i++){
            if(A[i]>=0){
                pos_elem++;
            }
            else{
                pos_elem=0;
            }

            if(max_count<pos_elem){
                max_count = pos_elem;
                max_count_index = i;
            }
        }
        int[] ans = new int[max_count];
        int si = max_count_index-max_count+1;
        int j = 0;
        for(int i = si;i<=max_count_index;i++){
            ans[j] = A[i];
            j++;
        }
        return ans;
    }
}
