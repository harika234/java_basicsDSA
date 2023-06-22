import java.util.Arrays;
public class product_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("given array is : "+ Arrays.toString(arr));
        int[] ans = productarray(arr);
        System.out.println("product array is : "+Arrays.toString(ans));
    }
    public static int[] productarray(int[] arr){
        int n = arr.length;
        int[] product = new int[n];
        int leftproduct = 1;
        for(int i=0;i<arr.length;i++){
            product[i]=leftproduct;
            leftproduct*=arr[i];
        }

        int rightproduct = 1;
        for(int i=n-1;i>=0;i--){
            product[i]*=rightproduct;
            rightproduct*=arr[i];
        }

        return product;
    }
}