import java.util.Arrays;

public class EvenRangeSumQuery {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int B[][] = {{0,2},{2,4},{1,4}};
        int[] res = countEvenRange(A,B);
        System.out.println(Arrays.toString(res));
    }

    public static int[] countEvenRange(int[] A,int[][] B){
        int n = A.length;
        for(int i=0;i<n;i++){
            if(A[i]%2==0){
                A[i]=1;
            }else{
                A[i]=0;
            }
        }

        int[] pf = new int[n];
        pf[0]=A[0];
        for(int i=1;i<n;i++){
            pf[i]=pf[i-1]+A[i];
        }

        int q = B.length;
        int[] outarray = new int[q];
        for(int i=0;i<q;i++){
            int left = B[i][0];
            int right = B[i][1];

            if(left==0){
                outarray[i]=pf[right];
            }
            else{
                outarray[i]=pf[right]-pf[left-1];
            }
        }
        return outarray;
    }
}
