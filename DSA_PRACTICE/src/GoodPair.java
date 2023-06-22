public class GoodPair {
    public static void main(String[] args) {
        int[] A = {2,3,3,5,1};
        int target = 19;
        int n = checkPairs(A,target);
        System.out.println(n);
    }
    public static int checkPairs(int[] A,int target){
        int n = A.length;
        for(int i=0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(A[i]+A[j]==target){
                    return 1;
                }
            }
        }
        return 0;
    }
}
