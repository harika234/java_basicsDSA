public class Antidiagonals {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3} ,{4,5,6},{7,8,9}};
        int[][] output = findanti(arr);

    }
    public static int[][] findanti(int[][] A){
        int rows = A.length;
        int cols = A[0].length;
        int k = 0;
        int[][] res = new int[rows + cols - 1][cols];
        for (int i = 0;i < cols; i++){
            int temp1 = 0;
            int temp2 = i;
            while (temp1 < rows && temp2 >= 0){
                res[k++][temp1++] = A[temp1++][temp2--];
            }
        }
        return res;
    }
}