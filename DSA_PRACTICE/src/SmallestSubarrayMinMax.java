public class SmallestSubarrayMinMax {
    public static void main(String[] args) {
        int[] A = {5,5};
        int size = findsmallestsubarray(A);
        System.out.println(size);
    }
// quality matters
    public static  int findsmallestsubarray(int[] arr){
        int n = arr.length;
        int max = arr[0];
        int min = arr[0];

        if(max == min){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        int min_i = -1;
        int max_i = -1;
        int ans = 0;
        for(int i = arr.length-1; i>=0; i--){
            if(arr[i] == min){
                min_i = i;
                if(max_i != -1){
                    int len = max_i - min_i +1;
                    if(ans<len){
                        ans = len;
                    }
                }
            }

            if(arr[i] == max){
                max_i = i;
                if(min_i != -1){
                    int len = min_i - max_i +1;
                    if(ans<len){
                        ans = len;
                    }
                }
            }


        }
        return  ans;

    }
}