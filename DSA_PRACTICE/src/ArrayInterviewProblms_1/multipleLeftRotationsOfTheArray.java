package ArrayInterviewProblms_1;

import java.util.Arrays;

public class multipleLeftRotationsOfTheArray {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5};
        int[] B = {2,3};

        int[][] op = rotation(A,B);
        System.out.println(Arrays.deepToString(op));
    }

    public static int[][] rotation(int[] A,int[] B){
        int[][] ans = new int[B.length][A.length];
        for(int i = 0 ; i< B.length;i++){
            int[] A1 = A.clone();
            int rotations = B[i]%A.length;
            rotation(A1,0,A1.length-1);
            rotation(A1,A1.length-rotations-1,A1.length-1);
            rotation(A1,A1.length-rotations,A1.length-1);
            for(int j=0;j<A1.length;j++){
                ans[i][j]= A1[j];
            }
        }
        return ans;
    }
    public static void rotation(int[] A,int start,int end){
        while(start<end){
            int temp = A[start];
            A[start] = A[end];
            A[end] = temp;
            start++;
            end--;
        }
    }
}
