package BitManipulations_1;

public class SubArraysWithBitWiseOr1 {
    public static void main(String[] args) {
        int[] A = {1,0,1};
        int n = A.length;
        long Total_SubArrays = (n*(n+1))/2;
        long zeroes_count = 0;
        long ans = 0;
        for(int i=0;i<n;i++){
            if(A[i]==0){
                zeroes_count++;
            }
            else{
                ans+=(zeroes_count*(zeroes_count+1))/2;
                zeroes_count=0;
            }
        }
        ans+=(zeroes_count*(zeroes_count+1))/2;
        System.out.println(Total_SubArrays-ans);
//        return Total_SubArrays-ans;
    }
}
