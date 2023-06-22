 import java.util.*;
public class RangeQuery {
    public static int[] findQuerySum(int[] A, int[][] B) {
        int N = A.length;
        int M = B.length;
        int[] result = new int[M];

        // Process each query
        for (int i = 0; i < M; i++) {
            int L = B[i][0];
            int R = B[i][1];
            int sum = 0;

            for (int j = L; j <= R; j++) {
                sum += A[j];
            }

            result[i] = sum;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] A1 = {1, 2, 3, 4, 5};
        int[][] B1 = {{0, 3}, {1, 2}};
        int[] result1 = findQuerySum(A1, B1);
        System.out.println(Arrays.toString(result1));


    }
}

