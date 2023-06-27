import java.util.Arrays;

public class TwoDColSum {
    public static void main(String[] args) {
        int[][] inputarray = {{1,2,3,4},
                              {5,6,7,8},
                              {9,10,11,12}};
        int[] output= colsum(inputarray);
        System.out.println(Arrays.toString(output));

    }
    public static int[] colsum(int[][] arr){
        int rows = arr.length;
        int cols = arr[0].length;
        int[] output = new int[cols];
        for(int i=0;i<cols;i++){
            int sum =0;
            for(int j=0;j<rows;j++){
                sum+=arr[j][i];
            }
            output[i]=sum;
        }
        return output;
    }
}
