import java.util.ArrayList;
import java.util.Arrays;

public class AlternatingSubArrays {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1};
        int B = 1;
        int[] output = findAlternatingSubarr(arr,B);
        System.out.println(Arrays.toString(output));
    }
    public static int[] findAlternatingSubarr(int[] A, int B){
        int n = A.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = B; i <= n-1-B; i++){
            int start = i-B;
            int end = i+B;
            boolean isAlternating = true;

            for(int j=start;j<end;j++){
                if(A[j]==1 && A[j+1]!=0){
                    isAlternating=false;
                    break;
                }
                if(A[j]==0 && A[j+1]!=1){
                    isAlternating=false;
                    break;
                }
            }
            if(isAlternating){
                list.add(i);
            }
        }

        int[] ans = new int[list.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]= list.get(i);
        }

        return ans;
    }
}
