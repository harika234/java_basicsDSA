public class max_min {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int res = maxmin(arr);
        System.out.println(res);
    }
    public static int maxmin(int[] arr){
         int max = arr[0];
         int min = arr[0];
         for(int i=0;i<arr.length;i++){
             if(arr[i]<min){
                 min = arr[i];
             }
             if(arr[i]>max){
                 max = arr[i];
             }
         }
         return max+min;
    }
}
