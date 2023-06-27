public class minorDiagonalSum {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{1,2,3},{1,2,3}};
        int op = minorsum(arr);
        System.out.println(op);

    }

    public static int minorsum(int[][] arr){
        int n = arr.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=arr[i][n-i-1];
        }
        return sum;
    }
}
