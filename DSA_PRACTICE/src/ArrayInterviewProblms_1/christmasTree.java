package ArrayInterviewProblms_1;

public class christmasTree {
    public static void main(String[] args) {
        int[] A = {1, 6, 4, 2, 6, 9};
        int[] B = {2, 5, 7, 3, 2, 7};

        int op = treesize(A,B);
        System.out.println(op);
    }
    public static int treesize(int[] A,int[] B){
        int total_cost = Integer.MAX_VALUE;
        int n = A.length;

        for(int i =0;i<n;i++){
            int left_cost = Integer.MAX_VALUE;
            int right_cost = Integer.MAX_VALUE;

            for(int j = 0;j<i;j++){
                if(A[j]<A[i]){
                    left_cost=Math.min(left_cost,B[j]);
                }
            }

            for(int k=i+1;k<n;k++){
                if(A[k]>A[i]){
                    right_cost=Math.min(right_cost,B[k]);
                }
            }

            if(left_cost!=Integer.MAX_VALUE && right_cost!= Integer.MAX_VALUE){
                total_cost = Math.min(total_cost,B[i]+left_cost+right_cost);
            }

        }
        if(total_cost == Integer.MAX_VALUE){
            return -1;
        }
        return total_cost;
    }
}
